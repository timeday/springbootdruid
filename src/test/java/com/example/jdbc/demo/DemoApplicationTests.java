package com.example.jdbc.demo;

import com.example.jdbc.demo.entity.Order;
import com.example.jdbc.demo.entity.User;
import com.example.jdbc.demo.service.OrderService;
import com.example.jdbc.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        List<Order> list = orderService.list();

        list.forEach(o -> System.out.println(o));

        List<User> list1 = userService.list();

       list1.forEach(user -> System.out.println(user));
    }


    @Test
    public void test(){
        userService.testTransage();
    }

}
