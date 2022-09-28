package com.example.demo.springevent.listener;

import com.example.demo.springevent.event.UserChangeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 用户信息变化监听
 *
 * @author: wucheng
 * @date: 2022/8/9
 **/
@Component
@Slf4j
public class UserChangeListener implements ApplicationListener<UserChangeEvent> {

    @Override
    public void onApplicationEvent(UserChangeEvent event) {
        log.info("UserChangeListener start, event:{}", event);

        try {
            Thread.sleep(100L);
        } catch (Exception e) {
            log.error("UserChangeListener failed", e);
        }

        log.info("UserChangeListener end");
    }
}
