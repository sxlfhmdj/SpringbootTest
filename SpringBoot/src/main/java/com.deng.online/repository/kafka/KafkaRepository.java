package com.deng.online.repository.kafka;

/**
 * Description: 【kafka 仓储】 <br/>
 * Created on 0:44 2017/6/11 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public interface KafkaRepository {

    /**
     * Discription: [向broker发送消息]
     * Created on: 0:59 2017/6/11
     * @param topic
     * @param data
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */
    public void sendMessage(String topic, String data);

    /**
     * Discription: [向broker发送消息]
     * Created on: 1:00 2017/6/11
     * @param topic
     * @param key
     * @param data
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */
    public void sendMessage(String topic, String key, String data);
}
