package com.deng.online.repository.elasticsearch;

import com.deng.online.bean.DemoBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * Description: 【ES调用】 <br/>
 * Created on 15:24 2017/6/7 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Component("demoSearchRepository")
public interface DemoSearchRepository extends ElasticsearchRepository<DemoBean, Long> {
    DemoBean findById(Long id);
    DemoBean findByIdAndPropertiesOne(Long id, String propertiesOne);
    DemoBean findByIdOrPropertiesOne(Long id, String propertiesOne);
    DemoBean findByPropertiesOneNot(String propertiesOne);
    DemoBean findByPropertiesOneLike(String propertiesOne);
}



