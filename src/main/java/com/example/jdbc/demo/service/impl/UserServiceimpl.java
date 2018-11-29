package com.example.jdbc.demo.service.impl;

import com.example.jdbc.demo.entity.User;
import com.example.jdbc.demo.mapper.UserMapper.UserInfoMapper;
import com.example.jdbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserInfoMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.findUserList();
    }
}
