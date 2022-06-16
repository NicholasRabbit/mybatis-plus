package com.myBatis.learn.service;

import com.myBatis.learn.entity.User;

import java.util.List;

public interface UserService {

    public List<User> selectList(User user);
}
