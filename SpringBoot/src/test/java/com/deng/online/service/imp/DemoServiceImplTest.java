package com.deng.online.service.imp;

import com.deng.online.bean.DemoBean;
import com.deng.online.repository.elasticsearch.DemoSearchRepository;
import com.deng.online.repository.kafka.KafkaRepository;
import com.deng.online.service.impl.DemoServiceImpl;
import com.deng.online.util.JsonUtils;
import com.deng.online.vo.DemoVo;
import org.apache.lucene.queryparser.flexible.core.QueryNodeException;
import org.apache.lucene.queryparser.flexible.core.builders.QueryBuilder;
import org.apache.lucene.queryparser.flexible.core.nodes.QueryNode;
import org.apache.lucene.queryparser.xml.FilterBuilder;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.kafka.core.KafkaTemplate;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 9:33 2017/5/5 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class DemoServiceImplTest extends BaseTest {

    @Autowired
    private DemoServiceImpl demoService;

    @Autowired
    private DemoSearchRepository demoSearchRepository;

    @Autowired
    private KafkaRepository kafkaRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Resource
    private KafkaTemplate<String, String> template;

    /**
     *  测试Kafka Provider 发送数据
     */
    @Test
    public void testSendMessage(){
        template.send("test1", "dfsdfdsfdsfsd");
    }


    /**
     *  测试Elasticsearch
     */
    @Test
    public void testQueryES(){
        // 高亮,排序
        HighlightBuilder.Field[] hfields=new HighlightBuilder.Field[1];
        hfields[0] = new HighlightBuilder.
                Field("").
                preTags("<em style='color:red'>").
                postTags("</em>").
                fragmentSize(250);

        SearchQuery query = new NativeSearchQueryBuilder().
                withQuery(new QueryStringQueryBuilder("h")).
                withSort(new FieldSortBuilder("id").order(SortOrder.DESC)).
                withHighlightFields(hfields).
                build();

        Iterable<DemoBean> searchResult = demoSearchRepository.search(query);
        Iterator<DemoBean> iterator = searchResult.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    /**
     *  测试Mybatis、Redis
     * @throws Exception
     */
    @Test
    public void testGetAllDemo() throws Exception {
        List<DemoVo> list =  demoService.getAllDemo();
        System.out.print(list.toString());
    }

    @Test
    public void testGetDemoByID() throws Exception {
        DemoVo vo = demoService.getDemoByID("1");
        System.out.print(vo.toString());
    }

    @Test
    public void testDeleteDemoByID() throws Exception {

    }
}