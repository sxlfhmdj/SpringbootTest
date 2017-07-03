package com.deng.online.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 【RabbitMQ 交换器、队列、绑定关系声明】 <br/>
 * Created on 15:10 2017/7/3 <br/>
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version 1.0 <br/>
 *          Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Configuration
public class RabbitConfig {

    /*******************交换器声明********************/
    //消息交换器
    @Bean
    public Exchange directExchange(){
        return new DirectExchange(RabbitContext.Exchange.MESSAGE_EXCHANGE, false, false, null);
    }


    /*******************队列声明********************/

    //邮件队列
    @Bean
    public Queue emailQueue(){
        return new Queue(RabbitContext.Queue.EMAIL_QUEUE, false, false, false, null);
    }

    //短信队列
    @Bean
    public Queue smsQueue(){
        return new Queue(RabbitContext.Queue.SMS_QUEUE, false, false, false, null);
    }

    //微信队列
    @Bean
    public Queue wechatQueue(){
        return new Queue(RabbitContext.Queue.WECHAT_QUEUE, false, false, false, null);
    }


    /*******************绑定声明********************/
    //邮件绑定
    @Bean
    public Binding emailBinding(){
        return new Binding(RabbitContext.Queue.EMAIL_QUEUE, Binding.DestinationType.QUEUE,
                RabbitContext.Exchange.MESSAGE_EXCHANGE, RabbitContext.RouteKey.EMAIL_ROUTEKEY, null);
    }

    //短信绑定
    @Bean
    public Binding smsBinding(){
        return new Binding(RabbitContext.Queue.SMS_QUEUE, Binding.DestinationType.QUEUE,
                RabbitContext.Exchange.MESSAGE_EXCHANGE, RabbitContext.RouteKey.SMS_ROUTEKEY, null);
    }

    //微信绑定
    @Bean
    public Binding wechatBinding(){
        return new Binding(RabbitContext.Queue.WECHAT_QUEUE, Binding.DestinationType.QUEUE,
                RabbitContext.Exchange.MESSAGE_EXCHANGE, RabbitContext.RouteKey.WECHAT_ROUTEKEY, null);
    }

}
