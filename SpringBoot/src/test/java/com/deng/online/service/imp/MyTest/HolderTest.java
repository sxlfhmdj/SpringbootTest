package com.deng.online.service.imp.MyTest;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 10:12 2017/5/17 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */

public class HolderTest<T> {

    private volatile T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
