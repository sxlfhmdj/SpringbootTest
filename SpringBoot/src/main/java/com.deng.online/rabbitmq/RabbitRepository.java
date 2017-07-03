package com.deng.online.rabbitmq;

/**
 * Description: 【Rabbit仓储】 <br/>
 * Created on 11:41 2017/6/30 <br/>
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version 1.0 <br/>
 *          Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public interface RabbitRepository {

    /**
     * 发送短信
     * @param message
     */
    public void sendSMS(String message);


    /**
     * 发送邮件
     * @param message
     */
    public void sendEmail(String message);

    /**
     * 发送微信
     * @param message
     */
    public void sendWechat(String message);


}
