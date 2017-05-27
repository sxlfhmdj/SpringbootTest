package com.deng.online.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 16:19 2017/5/5 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class ConvertUtils {

    /**
     * 把一个Bean对象转换成Map对象</br>
     *
     * @param obj
     * @return
     */
    public static Map convertBean2Map(Object obj) {
        Map map = new HashMap();
        Class c;
        try
        {
            c = Class.forName(obj.getClass().getName());
            Method[] m = c.getMethods();
            for (int i = 0; i < m.length; i++)
            {
                String method = m[i].getName();
                if (method.startsWith("get"))
                {
                    try{
                        Object value = m[i].invoke(obj);
                        if (value != null)
                        {
                            String key=method.substring(3);
                            key=key.substring(0,1).toUpperCase()+key.substring(1);
                            map.put(method.substring(3), value);
                        }
                    }catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("error:"+method);
                    }
                }
            }
        }
        catch (Exception e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        return map;
    }

}
