package com.deng.online.bean;

/**
 * Description: 【数据库查询映射对象Bean】 <br/>
 * Created on 17:30 2017/5/4
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class DemoBean {

    private Long id;//字段id
    private String propertiesOne;//属性01
    private String propertiesTwo;//属性02

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertiesOne() {
        return propertiesOne;
    }

    public void setPropertiesOne(String propertiesOne) {
        this.propertiesOne = propertiesOne;
    }

    public String getPropertiesTwo() {
        return propertiesTwo;
    }

    public void setPropertiesTwo(String propertiesTwo) {
        this.propertiesTwo = propertiesTwo;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "id=" + id +
                ", propertiesOne='" + propertiesOne + '\'' +
                ", propertiesTwo='" + propertiesTwo + '\'' +
                '}';
    }
}
