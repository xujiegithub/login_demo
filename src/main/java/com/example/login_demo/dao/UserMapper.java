package com.example.login_demo.dao;

import com.example.login_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    boolean addUser(User user);

    User login(User user);

}
