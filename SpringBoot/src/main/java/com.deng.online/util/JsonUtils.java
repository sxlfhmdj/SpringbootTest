package com.deng.online.util;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;

/**
 * Description: 【JSON工具】 <br/>
 * Created on 18:13 2017/5/5 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class JsonUtils {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);
    private static Gson gson = new Gson();


    public static String toJson(Object object){
        init();
        String jsonStr = gson.toJson(object);
        return jsonStr;
    }

    public static <T> T fromJson(String jsonStr, Class<T> clazz){
        init();
        T object = null;
        try{
             object = gson.fromJson(jsonStr, clazz);
        }catch(Exception e)
        {
            logger.error("Gson转换失败");
        }
        return object;
    }

    public static <T> T fromJson(String json, Type typeOfT){
        init();
        T object = null;
        try{
            object = gson.fromJson(json, typeOfT);
        }catch(Exception e)
        {
            logger.error("Gson转换失败");
        }
        return object;
    }

    private static void init(){
        if (null == gson){
            gson = new Gson();
        }
    }


}
