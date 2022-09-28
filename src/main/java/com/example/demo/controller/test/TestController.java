package com.example.demo.controller.test;

import com.example.demo.po.User;
import com.example.demo.springevent.event.UserChangeEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试入口
 *
 * @author: wucheng
 * @date: 2022/8/9
 **/
@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/executeListener")
    public String executeListener(@RequestParam(value = "username") String username) {
        log.info("--->>>executeListener working,username:{}", username);

        applicationEventPublisher.publishEvent(buildUserEvent(username));

        try {
            Thread.sleep(3000L);
        } catch (Exception e) {
            log.error("executeListener failed", e);
        }

        log.info("--->>>executeListener end");

        return "success";
    }

    private UserChangeEvent buildUserEvent(String username) {
        if (null == username) {
            username = "Tony";
        }
        User user = new User(9L, username, "password");

        UserChangeEvent userChangeEvent = new UserChangeEvent(this, user);

        return userChangeEvent;
    }
}
