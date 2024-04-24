package com.proj4.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class redistest {

    @Autowired(required = false)
    private RedisTemplate redisTemplate;

    @Test
    void getName(){
        redisTemplate.opsForValue().set("name","dadadingdada!");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }
}
