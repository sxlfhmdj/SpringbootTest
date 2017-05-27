package com.deng.online.service.imp.MyTest;

import java.lang.annotation.Annotation;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 11:08 2017/5/17 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@SPI("HELLO")
public class AnnotationTest {

    public static void main(String[] str){
        AnnotationTest.class.isAnnotationPresent(SPI.class);
        SPI spi = AnnotationTest.class.getAnnotation(SPI.class);
        System.out.print( spi.value());
    }

    private void test(){

    }
}
