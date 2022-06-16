package com.myBatis.learn.test;

import com.myBatis.learn.dao.UserDao;
import com.myBatis.learn.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyBatisPlusTest001 {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSelect(){
        System.out.println(userDao);
        List<User> userList = userDao.selectList(null);
        userList.forEach(user -> System.out.println("user==>" + user));

    }

}
