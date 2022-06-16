package com.myBatis.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *MyBatisPlus范例一
 *使用步骤：
 * 1，pom引入MyBatisPlus依赖
 * 2，Dao层的接口继承MyBatisPlus自带的BaseMapper，即可不用写xxxMapper.xml文件实现基本单表的增删改查
 * 3，使用@MapperScan注解时，dao包下的类不用加@Mapper或@Repository注解，但是会报假红，因此可加上@Repository
 */

@SpringBootApplication
@MapperScan(value = "com.myBatis.learn.dao")  //扫描指定包内的xxxMapper.java
public class MyBatisApplication001 {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication001.class,args);
    }
}
