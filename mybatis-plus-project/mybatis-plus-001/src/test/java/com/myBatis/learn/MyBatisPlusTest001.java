package com.myBatis.learn;

import com.myBatis.learn.dao.UserDao;
import com.myBatis.learn.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 使用测试类注意事项
 * 1，测试类在测试包的路径，要和主启动类的包路径一致
 * 2，高版本的SpringBoot(2.2.2以上)测试类要和主启动类的包路径相同，只导入spring-boot-starter-test依赖就行，不用导入junit依赖；
 * 3，注意@Test引入的包的路径，不是junit(import org.junit.Test;),而是springboot的（import org.junit.jupiter.api.Test）
 *   如果不对则会导致@Autowired无法自动注入
 * 4，较旧版本的SpringBoot（例2.1.1）不能用 org.junit.jupiter.api.Test，只能和junit联用，注意版本的问题
 *
 * */

@SpringBootTest
public class MyBatisPlusTest001 {

    @Autowired
    private UserDao userDao;


    @Test
    public void testSelect(){
        List<User> userList = userDao.selectList(null);
        //使用List的forEach(..)方法，并配合Lambda表达式
        userList.forEach(user -> System.out.println("user==>" + user));
        //Lambda第二种写法
        System.out.println("分割线===================");
        userList.forEach(System.out::println);
    }

}
