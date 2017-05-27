package com.deng.online.controller;

import com.deng.online.annotation.RequestDemoResolve;
import com.deng.online.vo.Person;
import com.deng.online.vo.request.DemoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Description: 【模板控制器】 <br/>
 * Created on 17:33 2017/5/4 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
@Controller
@RequestMapping("/")
public class DemoController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("demo")
    public String getAllDemo(Map<String,Object> map){
//        List<DemoVo> lists =  demoService.getAllDemo();
        Map<String, Object> demoMap = null;
//        List<Map<String, Object>> alldemo = new ArrayList<Map<String, Object>>();

//        if (lists!=null && lists.size()>0) {
//            for (DemoVo demoVo : lists) {
//                demoMap = ConvertUtils.convertBean2Map(demoVo);
//                alldemo.add(demoMap);
//            }
//        }
//        map.put("alldemo", alldemo);
//        logger.info(map.toString());
        return "demo";
    }

    @RequestMapping("demoCommit")
    public String getDemoCommit(@RequestDemoResolve DemoRequest<Person> req , Map<String,Object> map){
        String name = req.getParam().getName();
        String psw = req.getParam().getPassword();
        Date time = req.getParam().getTime();
        List<String> list = req.getParam().getResources();

        map.put("str", name+ "**" + psw + "**" + time + "**" + list.toString());
        return "demo";
    }

//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }


//    @RequestMapping("/getDemoByID")
//    @ResponseBody
//    public DemoVo getDemoByID(@RequestParam("id") String id) {
//        DemoVo demoVo = new DemoVo();
//        try {
//            demoVo = demoService.getDemoByID(id);
//            if (demoVo != null) {
//                demoVo.setInfo("查询成功");
//            } else {
//                demoVo.setInfo("该记录不存在");
//            }
//        } catch (Exception e) {
//            demoVo.setInfo(e.getMessage());
//        } finally {
//            return demoVo;
//        }
//    }

}
