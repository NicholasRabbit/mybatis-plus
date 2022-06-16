package com.myBatis.learn;

import com.myBatis.learn.dao.UserDao;
import com.myBatis.learn.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 使用测试类注意事项
 * 1，高版本的SpringBoot(2.2.2以上)测试类要和主启动类的包路径相同，只导入spring-boot-starter-test依赖就行，不用导入junit依赖；
 * 2，注意@Test引入的包的路径，不是junit(import org.junit.Test;),而是springboot的（import org.junit.jupiter.api.Test）
 *   如果不对则会导致@Autowired无法自动注入
 * 3，较旧版本的SpringBoot（例2.1.1）不能用 org.junit.jupiter.api.Test，只能和junit联用，注意版本我呢提
 * */
@SpringBootTest
public class MyBatisPlusTest001 {

    @Autowired
    private UserDao userDao;


    @Test
    public void testSelect(){

        List<User> userList = userDao.selectList(null);
        userList.forEach(user -> System.out.println("user==>" + user));

    }

}
