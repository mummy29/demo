package com.example.demo.service.user.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.po.User;
import com.example.demo.service.user.UserService;
import com.example.demo.service.user.UserTxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wucheng
 * @date: 2022/8/16
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserTxService userTxService;
    @Autowired
    private UserMapper userMapper;

    /**
     * 无事务的特殊方法
     */
    @Override
    public void executeMethod() {
        // 保存数据
        User user = new User();
        user.setUsername("Tony");
        user.setPassword("password123456");
        int result = userMapper.add(user);
        log.info("保存数据成功:{}", result);

        userTxService.executeTxMethod();
    }
}
