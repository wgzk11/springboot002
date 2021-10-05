package com.openlab.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/getMessage")
    public  void getStr()
    {
        redisTemplate.opsForValue().set("message","hello world");
        Object message = redisTemplate.opsForValue().get("message");
        System.out.println(message);
    }
}
