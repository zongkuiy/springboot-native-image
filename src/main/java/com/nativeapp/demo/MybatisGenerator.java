package com.nativeapp.demo;

import org.mybatis.generator.api.ShellRunner;

public class MybatisGenerator {

    public static void main(String[] args) {
        ShellRunner.main(new String[]{"-configfile", "src/main/resources/generatorConfig.xml", "-overwrite"});
    }

}