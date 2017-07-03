package com.deng.online.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Description: 【接收者】 <br/>
 * Created on 16:20 2017/7/3 <br/>
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version 1.0 <br/>
 *          Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Component
public class Receiver {

    @RabbitListener(queues = RabbitContext.Queue.SMS_QUEUE)
    public void sendSMS(String message){
        System.out.println("The Message is "+ message);
    }
}
