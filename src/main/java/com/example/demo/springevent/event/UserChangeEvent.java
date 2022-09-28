package com.example.demo.springevent.event;

import com.example.demo.po.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * 用户信息变化事件
 *
 * @author: wucheng
 * @date: 2022/8/9
 **/
@Getter
@Setter
@ToString
public class UserChangeEvent extends ApplicationEvent {

    private User user;

    public UserChangeEvent(Object obj, User user) {
        super(obj);
        this.user = user;
    }


}
