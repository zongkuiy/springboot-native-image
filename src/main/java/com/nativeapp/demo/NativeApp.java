package com.nativeapp.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(proxyBeanMethods = false)
@MapperScan(value="com.nativeapp.demo", sqlSessionTemplateRef = "sqlSessionTemplate")
public class NativeApp {

    public static void main(String[] args) {
        SpringApplication.run(NativeApp.class, args);
    }

}
