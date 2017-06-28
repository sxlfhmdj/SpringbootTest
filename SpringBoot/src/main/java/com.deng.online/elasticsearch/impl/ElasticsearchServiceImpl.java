package com.deng.online.elasticsearch.impl;

import com.deng.online.elasticsearch.ElasticsearchService;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 15:24 2017/6/7 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Service
public class ElasticsearchServiceImpl implements ElasticsearchService{
    @Autowired
    private  ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private Client esClient;

    private String esIndexName = "website";

    public List<String> queryId(String type, String[] fields, String content,
                                String sortField, SortOrder order, int from, int size) {
        SearchRequestBuilder reqBuilder = esClient.prepareSearch(esIndexName)
                .setTypes(type).setSearchType(SearchType.DEFAULT)
                .setExplain(true);
        QueryStringQueryBuilder queryString = QueryBuilders.queryStringQuery("\""
                + content + "\"");
        for (String k : fields) {
            queryString.field(k);
        }
        queryString.minimumShouldMatch("10");
        reqBuilder.setQuery(QueryBuilders.boolQuery().should(queryString))
                .setExplain(true);
        if (StringUtils.isNotEmpty(sortField) && order != null) {
            reqBuilder.addSort(sortField, order);
        }
        if (from >= 0 && size > 0) {
            reqBuilder.setFrom(from).setSize(size);
        }
        SearchResponse resp = reqBuilder.execute().actionGet();
        SearchHit[] hits = resp.getHits().getHits();
        ArrayList<String> results = new ArrayList<String>();
        for (SearchHit hit : hits) {
            results.add(hit.getId());
        }
        return results;
    }

}
