package com.deng.online;

import com.deng.online.resolvers.MyMethodArgumentsResolver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 【解析器配置器】 <br/>
 * Created on 22:19 2017/5/26 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Configuration
public class HandlerAdapterConfigeration {

    @Bean(name = "RequestMappingHandlerAdapter")
    @Qualifier(value = "RequestMappingHandlerAdapter")
    @Primary
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
        List<HandlerMethodArgumentResolver> argumentResolvers = new ArrayList<HandlerMethodArgumentResolver>();
        argumentResolvers.add(new MyMethodArgumentsResolver());
        adapter.setCustomArgumentResolvers(argumentResolvers);
        return adapter;
    }
}
