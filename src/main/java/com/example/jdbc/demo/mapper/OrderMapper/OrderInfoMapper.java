package com.example.jdbc.demo.mapper.OrderMapper;

import com.example.jdbc.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderInfoMapper {
    List<Order> findOrderList();

    int insert(Order order);
}
