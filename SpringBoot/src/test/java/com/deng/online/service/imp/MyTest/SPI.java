package com.deng.online.service.imp.MyTest;

import java.lang.annotation.*;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 11:09 2017/5/17 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SPI {
    String value() default "";
}
