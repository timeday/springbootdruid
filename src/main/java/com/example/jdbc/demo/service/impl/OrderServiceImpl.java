package com.example.jdbc.demo.service.impl;

import com.example.jdbc.demo.entity.Order;
import com.example.jdbc.demo.mapper.OrderMapper.OrderInfoMapper;
import com.example.jdbc.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderInfoMapper orderMapper;


    @Override
    public List<Order> list() {
        return orderMapper.findOrderList();
    }
}
