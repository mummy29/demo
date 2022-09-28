package com.example.demo.controller.test;

import com.example.demo.util.RedisUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * redis
 *
 * @author: wucheng
 * @date: 2022/5/25
 **/
@RequiredArgsConstructor
@RestController
@RequestMapping("/test/redis")
public class RedisController {

    private final RedisUtil redisUtil;

    @GetMapping("/set")
    public String redisSet(@RequestParam(value = "k") String k, @RequestParam(value = "v") String v) {
        redisUtil.set(k, v, null);

        return "set success";
    }

    @GetMapping("/get")
    public String redisGet(@RequestParam(value = "k") String k) {
        Object v = redisUtil.get(k);

        return Objects.isNull(v) ? "is null" : v.toString();
    }
}
