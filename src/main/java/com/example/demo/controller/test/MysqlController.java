package com.example.demo.controller.test;

import com.example.demo.mapper.UserMapper;
import com.example.demo.po.User;
import com.example.demo.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * mysql
 *
 * @author: wucheng
 * @date: 2022/5/25
 **/
@RequiredArgsConstructor
@RestController
@RequestMapping("/test/mysql")
public class MysqlController {

    private final UserMapper userMapper;
    private final UserService userService;

    @GetMapping("/testTx")
    public String testTx() {
        userService.executeMethod();
        return "success";
    }

    @GetMapping("/findAll")
    public List<User> dbFindAll() {
        List<User> userList = userMapper.findAll();

        return userList;
    }

    @GetMapping("/add")
    public String dbAdd() {
        User user = new User();
        user.setUsername("Tony");
        user.setPassword("password123456");
        int result = userMapper.add(user);

        return result > 0 ? "success" : "failed";
    }
}
