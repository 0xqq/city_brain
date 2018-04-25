package com.alibaba.brain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.alibaba.brain.mapper")//配置mapper扫描包
public class BrainApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrainApplication.class, args);


    }
}
