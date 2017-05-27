package com.deng.online.service;

import com.deng.online.vo.DemoVo;

import java.util.List;

/**
 * Description: 【模板服务】 <br/>
 * Created on 17:38 2017/5/4 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public interface DemoService {

    /**
     * Discription: [获取所有模板数据]
     * Created on: 9:16 2017/5/5
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */
    public List<DemoVo> getAllDemo();

    /**
     * Discription: [通过模板ID获取模板对象]
     * Created on: 9:17 2017/5/5
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */
    public DemoVo getDemoByID(String id);

    /**
     * Discription: [通过模板ID删除模板数据]
     * Created on: 9:18 2017/5/5
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */
    public int deleteDemoByID(String id);
}
