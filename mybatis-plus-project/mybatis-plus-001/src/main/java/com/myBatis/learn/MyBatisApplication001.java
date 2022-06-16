package com.myBatis.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *MyBatisPlus范例一
 *使用步骤：
 * 1，pom引入MyBatisPlus依赖
 * 2，Dao层的接口继承MyBatisPlus自带的BaseMapper，即可不用写xxxMapper.xml文件实现基本的增删改查
 */

@SpringBootApplication
@MapperScan(value = "com.myBatis.learn.dao")
public class MyBatisApplication001 {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication001.class,args);
    }
}
