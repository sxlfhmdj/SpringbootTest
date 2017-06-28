//package com.deng.online;
//
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Description: 【Kafka 生产【配置文件】 <br/>
// * Created on 10:15 2017/6/11 <br/>
// *
// * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
// * @version: 1.0 <br/>
// * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
// */
//@EnableKafka
//@Configuration
//public class KafkaProducersConfig {
//
//    @Value("${kafka.binder.brokers}")
//    private String brokers;
//
//    @Bean
//    public KafkaTemplate<String, String> kafkaTemplate() {
//        KafkaTemplate<String, String> kafkaTemplate = new KafkaTemplate<String, String>(producerFactory());
//        return kafkaTemplate;
//    }
//
//    @Bean
//    public ProducerFactory<String, String> producerFactory() {
//        // set the producer properties
//        Map<String, Object> properties = new HashMap<String, Object>();
//        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokers);
//        properties.put(ProducerConfig.RETRIES_CONFIG, 1);
//        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
//        properties.put(ProducerConfig.LINGER_MS_CONFIG, 1);
//        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
//        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//
//        return new DefaultKafkaProducerFactory<String, String>(properties);
//    }
//
//
//
//
//}
