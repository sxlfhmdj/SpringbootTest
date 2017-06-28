package com.deng.online;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 【SpringBoot Main】 <br/>
 * Created on 8:42 2017/5/5 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Configuration
@ComponentScan("com.deng.online")
@SpringBootApplication
@EnableElasticsearchRepositories
@MapperScan("com.deng.online.dao")

public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
