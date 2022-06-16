package com.myBatis.learn.controller;

import com.myBatis.learn.entity.User;
import com.myBatis.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/list")
    @ResponseBody
    public List<User> get(User user){
        //这里最终调用的是MyBastisPlus自带BaseMapper里的方法 ： List<T> selectList(@Param("ew") Wrapper<T> queryWrapper);
        //如果为空，则查询全部
        return userService.selectList(null);
    }
}
