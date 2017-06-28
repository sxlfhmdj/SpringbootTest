package com.deng.online.repository.redis.impl;

import com.deng.online.repository.redis.RedisRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Description: 【缓存服务实现】 <br/>
 * Created on 17:46 2017/5/5 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */

@Repository
public class RedisServiceImpl implements RedisRepository {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public boolean exists(String key) {
        return redisTemplate.hasKey(key);
    }

    @Override
    public String get(String key) {
        String value = (String) redisTemplate.opsForValue().get(key);
        return value;
    }

    @Override
    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public void addObject(String key, Object object) {
        redisTemplate.opsForValue().set(key, object);
    }

    @Override
    public void addObject(String key, Object object, int seconds) {
        redisTemplate.opsForValue().set(key, object);
        redisTemplate.expire(key, seconds, TimeUnit.SECONDS);
    }

    @Override
    public Object getObject(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void del(String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    @Override
    public void setAndExpire(String key, Object value, int seconds) {
        redisTemplate.opsForValue().set(key, value);
        redisTemplate.expire(key, seconds, TimeUnit.SECONDS);
    }

    @Override
    public void flushDB() {
        redisTemplate.getConnectionFactory().getConnection().flushDb();
    }

    @Override
    public void tailPush(String key, Object object) {
        redisTemplate.opsForList().rightPush(key, object);
    }

    @Override
    public void headPush(String key, Object object) {
        redisTemplate.opsForList().leftPush(key, object);
    }

}
