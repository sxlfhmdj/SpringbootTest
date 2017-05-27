package com.deng.online.service.imp;

import com.deng.online.bean.DemoBean;
import com.deng.online.util.JsonUtils;
import org.assertj.core.internal.Arrays;
import org.junit.Test;


/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 9:25 2017/5/6 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class UtilsTest extends BaseTest {

    /**
     * Discription: [测试JSON工具]
     * Created on: 9:30 2017/5/6
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */

    @Test
    public void testJsonUtils(){
        String mytest = System.getProperty("dubbo.container");
        System.out.println(mytest);

        DemoBean bean = new DemoBean();
        bean.setId(2L);
        bean.setPropertiesOne("one");
        bean.setPropertiesTwo("two");

        String jsonStr = JsonUtils.toJson(bean);
        System.out.println(jsonStr);

        DemoBean beanOther = JsonUtils.fromJson(jsonStr, DemoBean.class);
        System.out.println(beanOther.toString());
    }

}
