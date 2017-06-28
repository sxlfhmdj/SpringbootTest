package com.deng.online.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Description: 【数据库、ES查询映射对象Bean】 <br/>
 * Created on 17:30 2017/5/4
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Document(indexName = "website", type = "blog", indexStoreType = "fs",
        shards = 5, replicas = 1, refreshInterval = "-1")
public class DemoBean {
    @Id
    @Field(type = FieldType.Long)
    private Long id;//字段id
    @Field(type = FieldType.String, index = FieldIndex.analyzed, store = true)
    private String propertiesOne;//属性01
    @Field(type = FieldType.String, index = FieldIndex.analyzed, store = true)
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
