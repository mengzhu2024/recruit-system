package com.recruit.service.impl;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Param eval
 * @Time 2022/8/27 16:15
 */
@Service
public class RedisServiceImpl {
    @Resource
    RedisTemplate redisTemplate;

    /** 设置的时间单位是 分钟 */
    void set(String key,Object value){
        redisTemplate.opsForValue().set(key,value);
    }
    void set(String key,Object value,Integer time){
        redisTemplate.opsForValue().set(key,value,time, TimeUnit.MINUTES);
    }

    Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    void del(String key){
        redisTemplate.delete(key);
    }
}
