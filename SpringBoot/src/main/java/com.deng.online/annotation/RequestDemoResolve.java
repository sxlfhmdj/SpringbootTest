package com.deng.online.annotation;

import java.lang.annotation.*;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 17:16 2017/5/26 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestDemoResolve {

}
