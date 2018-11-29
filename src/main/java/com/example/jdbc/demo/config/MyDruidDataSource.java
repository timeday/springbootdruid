package com.example.jdbc.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.jdbc.demo.utils.AesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyDruidDataSource extends DruidDataSource {

    private static final Logger logger = LoggerFactory.getLogger(MyDruidDataSource.class);

    public MyDruidDataSource() {
    }

    public void setUsername(String username) {
        logger.debug("Set username: {}", username);
        super.setUsername(AesUtils.decrypt(username));
    }

    public void setPassword(String password) {
        logger.debug("Set password: {}", password);
        super.setPassword(AesUtils.decrypt(password));
    }
}
