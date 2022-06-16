package com.myBatis.learn;

import com.myBatis.learn.dao.UserDao;
import com.myBatis.learn.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusTest001 {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSelect(){
        System.out.println(userDao);
       /* List<User>  userList = userDao.selectList(null);
        userList.forEach(user -> System.out.println("user==>" + user));*/

    }

}
