package com.deng.online.zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.util.List;

/**
 * Description: 【zookeeper远程调用】 <br/>
 * Created on 10:10 2017/7/5 <br/>
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version 1.0 <br/>
 *          Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class ZookeeperAdmin {

    public static void main(String[] args) throws Exception {

        String connectString = "10.6.60.53:2181";//客户端列表
        //创建一个Wathcer
        Watcher watcher = new WatcherTest();
        //创建一个zookeeper client 实例
        ZooKeeper zk = new ZooKeeper(connectString, 3000, watcher);
        System.out.println("Hello zookeeper: "+ zk.getState());
        List<String> pathlist = zk.getChildren("/", watcher);
        System.out.println("See zookeeper: "+ pathlist.toString());

        String data = "i am comming!!!!";
        //ACL is Access Controll List
        zk.create("/dengjiang", data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zk.close();
    }

}


