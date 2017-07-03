package com.deng.online.rabbitmq.impl;

import com.deng.online.rabbitmq.RabbitContext;
import com.deng.online.rabbitmq.RabbitRepository;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Description: 【Rabbit仓储实现类】 <br/>
 * Created on 11:41 2017/6/30 <br/>
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version 1.0 <br/>
 *          Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Repository
public class RabbitRepositoryImpl implements RabbitRepository {
    @Autowired
    private RabbitMessagingTemplate rabbitTemplate;

    /**
     * 发送短信
     * @param message
     */
    public void sendSMS(String message){
        this.rabbitTemplate.convertAndSend(RabbitContext.Exchange.MESSAGE_EXCHANGE,
                RabbitContext.RouteKey.SMS_ROUTEKEY, message);
    }

    /**
     * 发送邮件
     * @param message
     */
    public void sendEmail(String message){
        this.rabbitTemplate.convertAndSend(RabbitContext.Exchange.MESSAGE_EXCHANGE,
                RabbitContext.RouteKey.EMAIL_ROUTEKEY, message);
    }

    /**
     * 发送微信
     * @param message
     */
    public void sendWechat(String message){
        this.rabbitTemplate.convertAndSend(RabbitContext.Exchange.MESSAGE_EXCHANGE,
                RabbitContext.RouteKey.WECHAT_ROUTEKEY, message);
    }

}
