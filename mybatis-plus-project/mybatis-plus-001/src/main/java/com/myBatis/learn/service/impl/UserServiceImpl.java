package com.myBatis.learn.service.impl;

import com.myBatis.learn.dao.UserDao;
import com.myBatis.learn.entity.User;
import com.myBatis.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectList(User user) {
        return userDao.selectList(null);
    }
}
