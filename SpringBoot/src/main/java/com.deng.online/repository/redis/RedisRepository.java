package com.deng.online.repository.redis;

/**
 * Description: 【缓存服务接口】 <br/>
 * Created on 17:59 2017/5/5 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public interface RedisRepository {
    /**
     * <p>Discription:[根据key查询是否在redis中存在]</p>
     * Created on 2015-03-26
     * @param key
     * @return
     * @author:[周志军]
     */
    public boolean exists(String key);

    /**
     * <p>Discription:[根据key查询redis中的value]</p>
     * Created on 2015-03-26
     * @param key
     * @return key对应的value
     * @author:[周志军]
     */
    public String get(String key);


    /**
     * <p>Discription:[根据key将value存入Redis]</p>
     * Created on 2015-03-26
     * @param key
     * @param value
     * @author:[周志军]
     */
    public void set(String key, Object value);

    /**
     * <p>Discription:[添加对象]</p>
     * Created on 2015-03-26
     * @param key
     * @param object
     * @author:[周志军]
     */
    public void addObject(String key,Object object);

    /**
     * <p>Discription:[带生命周期的对象]</p>
     * Created on 2015-03-26
     * @param key
     * @param object
     * @author:[周志军]
     */
    public void addObject(String key,Object object,int seconds);


    /**
     * <p>Discription:[获取对象]</p>
     * Created on 2015-03-26
     * @param key
     * @return object
     * @author:[周志军]
     */
    public Object getObject(String key);


    /**
     * <p>Discription:[删除对象]</p>
     * Created on 2015-03-26
     * @param key
     * @author:[周志军]
     */
    public void del(String key);


    /**
     * <p>Discription:[添加值，并且设置过期时间]</p>
     * Created on 2015-03-26
     * @param key
     * @param value
     * @param seconds
     * @author:[周志军]
     */
    public void setAndExpire(String key, Object value, int seconds);


    /**
     * <p>Discription:[立即写入]</p>
     * Created on 2015-03-26
     * @author:[周志军]
     */
    public void flushDB();


    /**
     * <p>Discription:[在redis消息队列队尾插入数据]</p>
     * Created on 2015-03-26
     * @param key
     * @param object
     * @author:[周志军]
     */
    public void tailPush(String key,Object object);

    /**
     * <p>Discription:[在redis消息队列对头插入数据]</p>
     * Created on 2015-03-26
     * @param key
     * @param object
     * @author:[周志军]
     */
    public void headPush(String key,Object object);

}
