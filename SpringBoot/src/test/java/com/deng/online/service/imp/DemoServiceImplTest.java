package com.deng.online.service.imp;

import com.deng.online.service.DemoService;
import com.deng.online.vo.DemoVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.util.List;

import static org.junit.Assert.*;

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