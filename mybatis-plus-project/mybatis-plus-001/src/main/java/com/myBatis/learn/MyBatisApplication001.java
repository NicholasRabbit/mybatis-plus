package com.myBatis.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.myBatis.learn.dao")
public class MyBatisApplication001 {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication001.class,args);
    }
}
