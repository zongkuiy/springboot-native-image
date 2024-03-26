# This Project

> 演示SpringBoot Native Image 的编译、配置和相关测试

### Dependencies
    GraalVM 21
    Win: Visual Studio 2022/C++桌面开发工具/MSVC V143 
    Ubuntu: gcc/glibc-devel/zlib-devel
    SpringBoot 3.2.0
    mybatis-spring-boot-starter 3.0.3
      
### NativeImage 打包
```
mvn -Pnative -DskipTests package
```

### 可能遇到的问题

1. Please specify class (or <module>/<mainclass>) containing the main entry point    
   >~~native-maven-plugin中指定mainClass~~
    SpringBoot 版本问题，3.2.0解决

2. Error: On Windows, GraalVM Native Image for JDK 21 requires Visual Studio 2022 version 17.1.0 or later (C/C++ Optimizing Compiler Version 19.31 or later).   
   > 注意visual studio中 c++桌面开发包版本；另外如果安装了多个visual studio版本，一定要注意编译过程中实际用的是哪个版本

3. native-image building on Windows currently only supports target architecture: AMD64   
   > visual studio installer中把中文语言包去掉，只保留英文

4. java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
   > 在reflect-config.json中增加下列配置
    ```
    {
            "name": "com.mysql.jdbc.Driver",
            "methods":
            [
                {
                    "name": "<init>",
                    "parameterTypes":
                    []
                }
            ]
        },
    ```

5. mapper bean 没有被初始化， 出现空指针错误   
    > 参考[issue #29614](https://github.com/spring-projects/spring-framework/issues/29614)   
    将@Resource注解改成 @Autowired注解
   

----------------------------------------------

# Spring Native Image 

### 传统的Java应用
- 编译和运行过程
```mermaid
  graph TB
  start[java源码] -- 编译(javac) --> bytecode[字节码]
  bytecode -- 运行(jvm) --> machinecode[机器码]
```

- 这个时候部署架构是这样的
```mermaid  
block-beta
columns 3
block:group2:3
  %% columns auto (default)
  JavaApp1
  JavaApp2
  JavaApp3
end
JRE/JDK:3
操作系统:3
物理机/虚拟机:3
  
```

优点：
+ 一次编译，到处运行
    * JRE 解释和执行, 并抹平不同操作系统的差异
+ 一个jdk/jre可以运行多个java实例

缺点：
+ 漫长初始启动时间
+ 庞大的内存消耗


### 云原生时代的Java应用

```mermaid  
block-beta
    columns 3
    block:group1:1
        columns 1
        app1("App1") jre1("JRE/JDK")
    end
    block:group2:1
        columns 1
        app2("App1") jre2("JRE/JDK")
    end
    block:group3:1
        columns 1
        app3("App3") jre3("JRE/JDK")
    end
    操作系统:3
    物理机/虚拟机:3
```

- 云原生时代的应用以容器为单位进行管理
- 容器无法修改

***看起来不太合理***： 每个容器都是需要打包一个jre进去
- 根源：bytecode只能被jvm执行，即使最简单的HelloWorld
- 对比其他语言，java的容器镜像会占用更多的额外空间

- 除此之外， 也会需要更多的启动时间和运行内存
1. 启动时间
- JVM启动和初始化
```mermaid
  graph LR
  类加载 --> 类初始化
  类初始化 --> JIT编译
  JIT编译 --> Tier3/C1编译/Client
  JIT编译 --> Tier4/C2编译/Server
```
- jvm的解释执行和编译执行
```mermaid
  graph LR
  方法调用 --> compiled{是否编译}
  compiled --是--> 读取CodeCache --> 编译执行 --> 结束
  compiled --否--> 解释执行 --> 结束
  解释执行 --> 解释调用次数统计
  解释调用次数统计 --> exceed{是否超过阈值}
  exceed --是--> 触发编译
  exceed --否--> 结束
  触发编译 --> 写入CodeCache --> 结束  

```


- 所有的class在启动时就要被初始化和加载
- JIT 把执行最多的bytecode编译成机器码
    - client compiler/C1: 启动时间快, 桌面应用/applet
    - server compiler/C2: 性能高, 长时间运行的服务端应用

2. 内存占用
    - JVM： 一个完整的解释器、一个JIT编译器以及一个垃圾回收器
    - 对象： class meta，object meta
    - GC
    - 反射和框架
```
一个空的Spring Web内存占用约为100MB左右，作为对比，一个golang的Web应用在10MB左右
```

***但是*** 云原生恰恰需要的是：快速灵活的启动、销毁

### 如何应对？ AOT/Native Image/GraalVM

1. AOT
   在编译期直接将bytecode编译成machinecode， 使java程序像native程序一样不依赖于jre就能够运行
```
AOT在不同的场景有不同的含义， 这里我们先限定在Java世界
```

2. GraalVM 的 Native Image   
没有了JVM， Substrate VM来代替
- 内存管理（GC）
- 线程调度
- JNI 支持
- Exception

### GraalVM优势
+ 构建阶段, 生成可直接运行的本地代码
```mermaid
flowchart LR
   应用程序 --> 静态分析
   第三方库 --> 静态分析
   JDK字节码 --> 静态分析
   静态分析 --> 可达代码
   可达代码 --> nativebinary
```
```
编译时已保存初始化好的堆快照
```
- 超快的启动时间
  ![bootime](./imgs/boot_time.png)
+ 运行阶段
    - 降低内存占用   
      ![quarkus_mem](./imgs/mem_quarkus.png)

      ![quarkus_crud_mem](./imgs/mem_crud_quarkus.png)



- 降低CPU占用
- 在启动时即可达到峰值性能，不需要预热时间

### 功能有何区别
有些功能需要特别进行配置
- 动态类加载：编译期需要对动态加载的类进行声明
- 反射：支持反射的类、方法、成员变量需要提前声明
- 动态代理：支持动态代理的interface需要提前声明
- JNI：需要提前声明.
- 序列化：需要提前声明(需要class metadata)

不再兼容的功能：
- InvokeDynamic 太过于动态了
- Security manager
- 只能使用调试


### native-image

#### 安装
- https://www.graalvm.org/latest/docs/getting-started/
    - GraalVM 21
    - VisualStudio2022 with C++ Desktop Dev Toolkits
    - Maven 3.9.5

#### 基础用法
- https://www.graalvm.org/latest/reference-manual/native-image/

#### 反射
- 能够被native-image自动识别的反射API
    - Class.forName、Class.getMethod...
- 需要编译期声明的反射
    - -H:ReflectionConfigurationFiles=./reflect-config.json
    - reflect-config.json
```json
[
  {
    "name": "java.lang.String",
    "methods": [
      {
        "name": "toUpperCase",
        "parameterTypes": []
      }
    ]
  }
]
```

#### 类初始化
- 默认：尽可能在编译时就完成尽可能多的类初始化
```
private static final int SOME_STATIC_VAR = ThreadLocalRandom.current().nextInt(100);
```
- 可以通过配置设置那些包或者类在哪个阶段进行初始化
```
--initialize-at-build-time
--initialize-at-run-time

如果一个类在编译的时候进行初始化，那么它所有的父类也要在编译阶段完成初始化
如果一个类在运行阶段进行初始化，那么它所有的子类也必须在运行阶段完成初始化
```


#### 动态代理
- 自动识别
```
java.lang.reflect.Proxy.newProxyInstance(ClassLoader, Class<?>[], InvocationHandler)
java.lang.reflect.Proxy.getProxyClass(ClassLoader, Class<?>[])
```
- 配置指定
```
[
  {
    "interfaces": ["java.util.concurrent.Callable"]
  }
]

```
#### 资源文件
- 自动识别
```
Class.getResource()
Class.getResourceAsStream()
ClassLoader.getResource()
ClassLoader.getResourceAsStream()
ClassLoader.getResources()
```
- 配置指定
```
{
  "resources": {
    "includes": [
      {
        "pattern": "input.txt"
      }
    ]
  }
}

```

#### 序列化
- 指定哪些类需要序列化支持
```
[
  {
    "name": "com.example.MyClass"
  }
]
```

#### 推荐的配置文件描述
|配置文件|	描述	|
|---|---|
jni-config.json	|JNI|	
predefined-classes-config.json	| predefined class
proxy-config.json|		Dynamic proxy|
reflect-config.json	|	Reflection|
resource-config.json|		Resources	|
serialization-config.json	|	Serialization	|	

#### 编译过程解析
参考[文档](https://www.graalvm.org/latest/reference-manual/native-image/overview/BuildOutput/)

[1/8] Initializing...                                                                                    (2.5s @ 0.23GB)
> 初始化：   
> ①确定可执行文件类型（share libraries or static)    
> ②确定java版本信息(java.vm.version 和 java.vendor.version)   
> ③确定编译器类型和参数   
> ④GC类型（默认Serial GC） -- G1GC 不在 GraalVM 的社区版中   
> ⑤确定编译过程使用多大的资源

[2/8] Performing analysis...  [******]                                                                  (16.6s @ 2.64GB)
> 分析：
> 检查和分析所有的类、字段和方法，确定哪些是可达的（在程序运行时可能会用到的）。
> 注册需要在运行时进行反射操作的类、字段和方法，以及需要在 JNI 中访问的类、字段和方法。

[3/8] Building universe...                                                                               (3.0s @ 3.22GB)
> 构建宇宙：   
> A universe with all types, fields, and methods is built, which is then used to create the native binary.   
> → 准备生成native文件的一切所需

[4/8] Parsing methods...      [***]                                                                      (5.9s @ 3.63GB)
> 解析方法：   
> Graal compiler 解析所有可达方法，并把它们转化为 GraalVM 可以理解的中间表示。

[5/8] Inlining methods...     [***]                                                                      (0.8s @ 3.76GB)
> 内联方法, 减少方法调用的开销

[6/8] Compiling methods...    [******]                                                                  (32.8s @ 2.33GB)
> 编译方法：把所有的方法编译成本地机器码。

[7/8] Layouting methods...    [**]                                                                       (4.9s @ 3.71GB)
> 对类和其成员变量进行布局的过程, 确定每个类实例的内存布局，包括其中的成员变量及其在内存中的位置。

[8/8] Creating image...       [**]                                                                       (4.0s @ 4.54GB)
> 创建映像：把所有的代码、数据和资源打包成一个单一的可执行文件。


- 一次典型的构建过程
```
[1/8] Initializing...                                                                                    (2.5s @ 0.23GB)
Java version: 21.0.2+13-LTS, vendor version: Oracle GraalVM 21.0.2+13.1
Graal compiler: optimization level: 2, target machine: x86-64-v3, PGO: ML-inferred
C compiler: gcc (linux, x86_64, 11.4.0)
Garbage collector: Serial GC (max heap size: 80% of RAM)
2 user-specific feature(s):
- com.oracle.svm.thirdparty.gson.GsonFeature
- org.springframework.aot.nativex.feature.PreComputeFieldFeature
------------------------------------------------------------------------------------------------------------------------
5 experimental option(s) unlocked:
- '-H:ReflectionConfigurationFiles' (origin(s): command line)
- '-H:JNIConfigurationFiles' (origin(s): command line)
- '-H:ResourceConfigurationResources' (origin(s): 'META-INF/native-image/org.apache.tomcat.embed/tomcat-embed-core/native-image.properties' in 'file:///home/zongkuiy/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.1.16/tomcat-embed-core-10.1.16.jar', 'META-INF/native-image/org.apache.tomcat.embed/tomcat-embed-el/native-image.properties' in 'file:///home/zongkuiy/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/10.1.16/tomcat-embed-el-10.1.16.jar', 'META-INF/native-image/org.apache.tomcat.embed/tomcat-embed-websocket/native-image.properties' in 'file:///home/zongkuiy/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.16/tomcat-embed-websocket-10.1.16.jar')
- '-H:SerializationConfigurationFiles' (origin(s): command line)
- '-H:ReflectionConfigurationResources' (origin(s): 'META-INF/native-image/org.apache.tomcat.embed/tomcat-embed-core/native-image.properties' in 'file:///home/zongkuiy/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.1.16/tomcat-embed-core-10.1.16.jar', 'META-INF/native-image/org.apache.tomcat.embed/tomcat-embed-el/native-image.properties' in 'file:///home/zongkuiy/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/10.1.16/tomcat-embed-el-10.1.16.jar', 'META-INF/native-image/org.apache.tomcat.embed/tomcat-embed-websocket/native-image.properties' in 'file:///home/zongkuiy/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.16/tomcat-embed-websocket-10.1.16.jar')
------------------------------------------------------------------------------------------------------------------------
Build resources:
- 20.21GB of memory (64.9% of 31.13GB system memory, determined at start)
- 17 thread(s) (100.0% of 17 available processor(s), determined at start)
  SLF4J: No SLF4J providers were found.
  SLF4J: Defaulting to no-operation (NOP) logger implementation
  SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
  [2/8] Performing analysis...  [******]                                                                  (16.6s @ 2.64GB)
  20,103 reachable types   (90.9% of   22,106 total)
  31,329 reachable fields  (62.2% of   50,398 total)
  109,481 reachable methods (61.5% of  178,140 total)
  6,520 types, 1,265 fields, and 11,146 methods registered for reflection
  69 types,    77 fields, and    61 methods registered for JNI access
  4 native libraries: dl, pthread, rt, z
  [3/8] Building universe...                                                                               (3.0s @ 3.22GB)
  [4/8] Parsing methods...      [***]                                                                      (5.9s @ 3.63GB)
  [5/8] Inlining methods...     [***]                                                                      (0.8s @ 3.76GB)
  [6/8] Compiling methods...    [******]                                                                  (32.8s @ 2.33GB)
  [7/8] Layouting methods...    [**]                                                                       (4.9s @ 3.71GB)
  [8/8] Creating image...       [**]                                                                       (4.0s @ 4.54GB)
```

### 怎么在实际项目中用起来

> 关键：第三方库是不是支持
  + 有一些类库官方已经支持， eg. netty
    - native-image.properties
  + 对于不支持的库
    - 自己改
    - 用框架 Quarkus/Micronaut/Spring Native

#### Quarkus
TBD
#### Micronaut
TBD
#### Spring Native
本项目

### 性能测试(Native VS JVM)

- 基础环境
  + TestTool: apache bench
  + Hardware: 
    + Ubuntu22-x64 i7-12700K/32G
  + 静态对比

| Mode | Binary大小  | 启动时间   | 初始启动内存占用 | 编译时间 |
|--------|-----------|--------|---------|------|
| JVM | 26M (JAR) | 1.336s | 242M    | 2.8s |
| Native | 104M     | 0.075s | 125M    | 70s  |
    - 17x 启动时间提升
    - 内存占用减少为原来的50%

  + 性能对比
#### scenario 1: 1000并发, 共100w次, tomcat最大线程数2000
  
| Mode   | 总耗时(s)    | 平均响应时间(s)  | RPS(req/s) | 最长响应时间(ms) | rt90(ms) | rt95(ms) | rt99(ms)     |
|--------|-----------|-----------------|------------|----------------|----------|----------|--------------|
|JVM	|27.267|	27.267	|36674	|2048|	28|	30	|36|
|Native	|26.898|	26.898|	37177.37|	2743|	17	|20|	1026|

##### CPU 对比
![](./imgs/n100w_c1000_tomcatmax2000.cpu.png)
##### Mem 对比
![](./imgs/n100w_c1000_tomcatmax2000.mem.png)


#### scenario 2: 2000并发, 共1kw次, tomcat最大线程数2000

| Mode   | 总耗时(s)    | 平均响应时间(s)  | RPS(req/s) | 最长响应时间(ms) | rt90(ms) | rt95(ms) | rt99(ms)     |
|--------|-----------|-----------------|------------|----------------|----------|----------|--------------|
|JVM	|263.155	|52.631	|38000.36	|2799	|58|61	|	68|
|Native	|282.723	|56.545	|35370.25	|14240	|42	|48|	1057|


##### CPU 对比
![](./imgs/n1000w_c2000_tomcatmax2000.cpu.png)

##### Mem 对比
![](./imgs/n1000w_c2000_tomcatmax2000.mem.png)

#### scenario 3: 5000并发, 共1kw次, tomcat最大线程数2000

| Mode   | 总耗时(s)   | 平均响应时间(s)  | RPS(req/s) | 最长响应时间(ms) | rt90(ms) | rt95(ms) | rt99(ms)     |
|--------|------------|-----------------|------------|----------------|----------|----------|--------------|
|JVM	|261.439	|130.719	|38249.89	|7718	|145	|151	|166|
|Native	|312.032	|156.016	|32048.03	|58936	|131	|1077	|2111|

##### CPU 对比
![](./imgs/n1000w_c5000_tomcatmax2000.cpu.png)

##### Mem 对比
![](./imgs/n1000w_c5000_tomcatmax2000.mem.png)

#### 性能测试结论
- Native 启动时间和内存占用优势遥遥领先
- JVM前期的解释执行工作和预热阶段的编译工作，需要占用更多的CPU
- Native CPU占用平缓，但是长时间运行的时候并不占优

  
#### ab测试结果详情
- 测试数据记录：请查看performance目录

> 测试注意事项
```
1. 如果是 Linux 环境，注意增大‘用户可以打开文件的最大数目’(ulimit -n)
2. 增大 Tomcat 线程池默认线程数
    server.tomcat.threads.max = 2000
3. 如果使用 Intel CPU 的 PC 进行测试，最好关闭小核
4. jstack会导致native image进程崩溃
```


### 总结
#### 比较明显的优势
- 更小的镜像空间占用
- 更少的内存占用
- 更少的启动时间
- 更快进入峰值性能

#### 劣势
- 需要更长的编译时间
- 第三方库的支持比较差
- 不支持交叉编译
- 使用动态特性时需要特别考虑


### 后续
#### SpringNative优化
+ 使用G1GC提升吞吐量
+ 开启PGO优化(基于程序特征的优化)
+ 开启CPU选项-march=native(GCC针对目标架构的优化)

#### Quarkus
+
#### Micronaut
+
