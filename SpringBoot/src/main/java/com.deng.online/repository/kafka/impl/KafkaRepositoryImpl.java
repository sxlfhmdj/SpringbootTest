package com.deng.online.repository.kafka.impl;

import com.deng.online.repository.kafka.KafkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Description: 【kafka 仓储实现】 <br/>
 * Created on 0:44 2017/6/11 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */

@Repository
public class KafkaRepositoryImpl implements KafkaRepository{

    @Resource
    private KafkaTemplate<String, String> template;

    public void sendMessage(String topic, String data){
        template.send(topic, data);
    }

    public void sendMessage(String topic, String key, String data){
        template.send(topic, key, data);
    }

}
