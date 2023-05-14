package com.jyd.redisson.demos;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedissonDemo {

    @Autowired
    private RedissonClient redissonClient;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    public void t1(String[] args) {
        // redisson 锁
        RLock lock = redissonClient.getLock("d");
        try {

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}
