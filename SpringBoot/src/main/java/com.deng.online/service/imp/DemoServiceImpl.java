package com.deng.online.service.imp;

import com.deng.online.bean.DemoBean;
import com.deng.online.dao.DemoDao;
import com.deng.online.redis.RedisDBService;
import com.deng.online.redis.RedisKey;
import com.deng.online.service.DemoService;
import com.deng.online.util.JsonUtils;
import com.deng.online.vo.DemoVo;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 【模板操作服务】 <br/>
 * Created on 17:46 2017/5/4 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */

@Service
public class DemoServiceImpl implements DemoService{

    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private DemoDao demoDao;

    @Autowired
    private RedisDBService redisDBService;

    @Override
    public List<DemoVo> getAllDemo() {
        List<DemoBean> demobeans = getDemoList();
        List<DemoVo> demoVos = new ArrayList<DemoVo>();

        if (demobeans !=null && demobeans.size() >0){
            for(DemoBean demoBean : demobeans){

                DemoVo vo = new DemoVo();
                vo.setId(demoBean.getId());
                vo.setPropertiesOne(demoBean.getPropertiesOne());
                vo.setPropertiesTwo(demoBean.getPropertiesTwo());
                demoVos.add(vo);
            }
        }
        return demoVos;
    }

    @Override
    public DemoVo getDemoByID(String id) {
        DemoBean bean = demoDao.queryDemoByID(Long.parseLong(id));
        DemoVo vo = new DemoVo();
        if (bean != null){
            vo.setId(bean.getId());
            vo.setPropertiesOne(bean.getPropertiesOne());
            vo.setPropertiesTwo(bean.getPropertiesTwo());
        }
        return vo;
    }


    /**
     * TODO [根据DemoID删除Demo数据]
     * Discription: [根据DemoID删除Demo数据]
     * Created on: 9:56 2017/5/8
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */
    @Override
    public int deleteDemoByID(String id) {
        /**1、删除数据库数据*/
        /**2、删除数据库数据影响记录数大于0，则更新数据缓存*/
        return 0;
    }


    /**
     * Discription: [更新Demo数据缓存]
     * Created on: 9:51 2017/5/8
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */

    public void updateDemoCache(){
        List<DemoBean> demobeans = demoDao.queryDemoList();
        String data = "";
        if (demobeans != null && demobeans.size() > 0){
            data = JsonUtils.toJson(demobeans);
        }
        //将数据放入缓存中
        redisDBService.set(RedisKey.DEMO_KEY, data);
        logger.info(String.format("将[%s]放入key为[%s]的缓存中", data.toString(),
                RedisKey.DEMO_KEY));
    }


    /**
     * Discription: [获取所有DemoBean列表,先从Cache中获取，获取不到再从DataBase中获取]
     * Created on: 9:49 2017/5/8
     * @param:
     * @return:
     * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a>
     */

    private List<DemoBean> getDemoList(){
        List<DemoBean> demobeans = new ArrayList<DemoBean>();
        //先从缓存中获取数据，如果数据为空，则查询数据库
        String jsonData = redisDBService.get(RedisKey.DEMO_KEY);
        logger.info(String.format("缓存中取出key为[%s]的数据为[%s]",  RedisKey.DEMO_KEY,
                jsonData));

        if (!StringUtils.isEmpty(jsonData)){
            demobeans = JsonUtils.fromJson(jsonData,
                    new TypeToken<List<DemoBean>>(){}.getType());
        }else{
            demobeans = demoDao.queryDemoList();
            String data = JsonUtils.toJson(demobeans);
            //将数据放入缓存中
            redisDBService.set(RedisKey.DEMO_KEY, data);
            logger.info(String.format("将[%s]放入key为[%s]的缓存中", data.toString(),
                    RedisKey.DEMO_KEY));
        }

        return demobeans;
    }


}
