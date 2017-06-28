package com.deng.online.controller;

import com.deng.online.util.ConvertUtils;
import com.deng.online.vo.DemoVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Description: 【Controller测试模板】 <br/>
 * Created on 9:55 2017/6/9 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController{
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from ThymeleafDemoController.hello");
        return"/hello";
    }

    @RequestMapping("/sendMessage")
    public String sendMessage(Map<String,Object> map){
        demoService.sendMessage("test1", "data");
        return "/hello";
    }

    @RequestMapping("/getDemo")
    public String getAllDemo(Map<String,Object> map){
        List<DemoVo> lists =  demoService.getAllDemo();
        Map<String, Object> demoMap = null;
        List<Map<String, Object>> alldemo = new ArrayList<Map<String, Object>>();

        if (lists!=null && lists.size()>0) {
            for (DemoVo demoVo : lists) {
                demoMap = ConvertUtils.convertBean2Map(demoVo);
                alldemo.add(demoMap);
            }
        }
        map.put("hello", alldemo);
        return "/hello";
    }

    @RequestMapping("/findDemo")
    public String findDemoByID(Map<String,Object> map){
        DemoVo vo = demoService.findById("1");
        map.put("hello", vo);
        return "/hello";
    }

    @RequestMapping(value = "/demos/{id}", method = RequestMethod.GET, consumes="application/json")
    @ResponseBody
    @GetMapping
    public DemoVo get(@PathVariable(name = "id")int id){
        DemoVo vo  = demoService.getDemoByID(String.valueOf(id));
        return vo;
    }

}
