package com.deng.online.receiver;

import com.deng.online.util.JsonUtils;
import com.deng.online.vo.DemoVo;
import org.apache.commons.lang.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Optional;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 1:19 2017/6/11 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Component
public class DemoReceiver {
    private static final Logger logger = LoggerFactory.getLogger(DemoReceiver.class);
    /**
     * 处理topic为test的消息
     * @param record
     */
    @KafkaListener(topics = {"test1"})
    public void processMessage(ConsumerRecord<?, ?> record) {
        try{
            Optional<?> messages = Optional.ofNullable(record.value());
            if (messages.isPresent()) {
                Object message = messages.get();
                logger.info("this is the testTopic send message: " + message);
            }
        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }
}
