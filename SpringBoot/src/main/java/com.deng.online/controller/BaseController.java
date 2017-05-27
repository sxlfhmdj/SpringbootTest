package com.deng.online.controller;

import com.deng.online.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Description: 【控制层基本类】 <br/>
 * Created on 17:34 2017/5/4 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class BaseController{

    @Autowired
    public DemoService demoService;

}
