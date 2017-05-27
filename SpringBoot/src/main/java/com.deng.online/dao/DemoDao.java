package com.deng.online.dao;

import com.deng.online.bean.DemoBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 【Sql映射方法接口演示】 <br/>
 * Created on 17:28 2017/5/4 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public interface DemoDao {

    /**
     * Discription: [查询所有的模板数据列表]
     * Created on: 17:54 2017/5/4
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */

    public List<DemoBean> queryDemoList();

    /**
     * Discription: [根据id查询模板数据]
     * Created on: 17:55 2017/5/4
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */

    public DemoBean queryDemoByID(@Param("id") long id);

    /**
     * Discription: [根据id修改模板数据]
     * Created on: 17:58 2017/5/4
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */

    public int updateDemoByID(DemoBean bean);

    /**
     * Discription: [增加模板数据]
     * Created on: 18:00 2017/5/4
     * @param bean
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */

    public int addDemo(DemoBean bean);

    /**
     * Discription: [删除模板数据]
     * Created on: 20:39 2017/5/4
     * @param: 模板
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */

    public int deleteDemoByID(@Param("id") Long id);
}
