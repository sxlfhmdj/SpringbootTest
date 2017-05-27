package com.deng.online.vo.request;

import com.deng.online.vo.Person;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 15:18 2017/5/24 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class DemoRequest<T> {
    private T param;

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}
