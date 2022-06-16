package com.myBatis.learn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myBatis.learn.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends BaseMapper<User> {


}
