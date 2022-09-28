package com.example.demo.service.user.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.po.User;
import com.example.demo.service.user.UserTxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: wucheng
 * @date: 2022/8/16
 **/
@Slf4j
@Service
public class UserTxServiceImpl implements UserTxService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public void executeTxMethod() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            log.error("sb error");
        }

        User user = new User();
        user.setUsername("TonyTx");
        user.setPassword("password123456Tx");
        int result = userMapper.add(user);
        log.info("tx保存成功:{}", result);
    }
}
