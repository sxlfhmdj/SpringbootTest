package com.deng.online.elasticsearch;

import org.elasticsearch.search.sort.SortOrder;

import java.util.List;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 15:24 2017/6/7 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public interface ElasticsearchService {
    public List<String> queryId(String type, String[] fields, String content,
                                String sortField, SortOrder order, int from, int size);
}
