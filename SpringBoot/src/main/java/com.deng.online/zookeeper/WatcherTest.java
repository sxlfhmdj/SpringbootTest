package com.deng.online.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * Description: 【Watcher】 <br/>
 * Created on 10:28 2017/7/5 <br/>
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version 1.0 <br/>
 *          Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class WatcherTest implements Watcher{

    public void process(WatchedEvent event) {
        if (!Watcher.Event.EventType.None.equals(event.getType())){
            String path = event.getPath();
            System.out.println("Zookeeper Do: " + path + "  " + event.getType());
        }
    }
}
