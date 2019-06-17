package com.example.jdbc.demo.service.impl;

import com.example.jdbc.demo.entity.Order;
import com.example.jdbc.demo.entity.User;
import com.example.jdbc.demo.mapper.OrderMapper.OrderInfoMapper;
import com.example.jdbc.demo.mapper.UserMapper.UserInfoMapper;
import com.example.jdbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserInfoMapper userMapper;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<User> list() {
        return userMapper.findUserList();
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Transactional
    @Override
    public void testTransage() {
        Order order=new Order();
        order.setName("order");
        orderInfoMapper.insert(order);

        User user=new User();
        user.setName("user1");

        userMapper.insert(user);

        int i=1/0;
    }
}
