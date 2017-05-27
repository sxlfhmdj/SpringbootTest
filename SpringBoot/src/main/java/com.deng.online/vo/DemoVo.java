package com.deng.online.vo;

/**
 * Description: 【服务返回模板实体】 <br/>
 * Created on 17:39 2017/5/4 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class DemoVo extends BaseVo{

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
