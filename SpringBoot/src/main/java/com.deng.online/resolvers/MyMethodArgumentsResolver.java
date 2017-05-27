package com.deng.online.resolvers;

import com.deng.online.annotation.RequestDemoResolve;
import com.deng.online.vo.Person;
import com.deng.online.vo.request.DemoRequest;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 18:07 2017/5/24 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class MyMethodArgumentsResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        if (methodParameter.hasParameterAnnotation(RequestDemoResolve.class)) {
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
            Type typeParent = methodParameter.getGenericParameterType();
            if (typeParent instanceof ParameterizedType) {
                //args所有的元素都是class
                Type[] args = ((ParameterizedType) typeParent).getActualTypeArguments();
                //Class<?> class com.deng.online.vo.request.DemoRequest
                Type rawtype = ((ParameterizedType) typeParent).getRawType();
                int arglen = args.length;
                DemoRequest request = ((Class<DemoRequest>) rawtype).newInstance();
                request.setParam(((Class<Person>)args[0]).newInstance());
                ((Person)request.getParam()).setName("12313123");
                return request;
            }

            return null;
    }
}
