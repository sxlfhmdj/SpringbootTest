//package com.deng.online;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.config.KafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Description: 【Kafaka 消费配置文件】 <br/>
// * Created on 10:19 2017/6/11 <br/>
// *
// * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
// * @version: 1.0 <br/>
// * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
// */
//@Configuration
//@EnableKafka
//public class KafkaConsumerConfig {
//    @Value("${kafka.binder.brokers}")
//    private String brokers;
//
//    @Value("${kafka.group}")
//    private String group;
//
//    @Bean
//    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
//
//        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
//        factory.setConsumerFactory(consumerFactory());
//        factory.setConcurrency(4);
//        factory.getContainerProperties().setPollTimeout(4000);
//
//        return factory;
//    }
//
//    public ConsumerFactory<String, String> consumerFactory() {
//
//        Map<String, Object> properties = new HashMap<String, Object>();
//
//        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, brokers);
//        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
//        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
//        properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "15000");
//        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        properties.put(ConsumerConfig.GROUP_ID_CONFIG, group);
//        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
//
//        return new DefaultKafkaConsumerFactory<String, String>(properties);
//    }
//}
