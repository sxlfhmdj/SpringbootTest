package com.deng.online.rabbitmq;

/**
 * Description: 【RabbitMQ上下文】 <br/>
 * Created on 15:29 2017/7/3 <br/>
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version 1.0 <br/>
 *          Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public interface RabbitContext {

    public interface Exchange{
        public static final String MESSAGE_EXCHANGE = "message_exchange";
    }

    public interface Queue{
        public static final String EMAIL_QUEUE = "email_queue";
        public static final String SMS_QUEUE = "sms_queue";
        public static final String WECHAT_QUEUE = "wechat_queue";
    }

    public interface RouteKey{
        public static final String EMAIL_ROUTEKEY = "email";
        public static final String SMS_ROUTEKEY = "sms";
        public static final String WECHAT_ROUTEKEY = "wechat";
    }

}
