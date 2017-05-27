package com.deng.online.service.imp.MyTest;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 17:33 2017/5/22 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
import java.util.Date;
public  class Test extends Date{

    /**
     * @param args add by zxx ,Dec 9, 2008
     */
    public static void main(String[] args) {
        String str = "123我是woshi 一个Query of Db";
        try {
            System.out.print(new String(str.getBytes("utf-8"),"GBK"));
        }catch (Exception e){
            e.getMessage();
        }

        // TODO Auto-generated method stub
//        new Test().test();

    }

    public void test()
    {
        System.out.println(
                super.getClass().getSuperclass().getName()
        );
    }
}

