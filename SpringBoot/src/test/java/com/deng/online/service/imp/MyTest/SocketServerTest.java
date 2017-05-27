package com.deng.online.service.imp.MyTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 10:05 2017/5/22 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class SocketServerTest {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8989);
            Socket socket = null;
            InputStream ips = null;
            InputStreamReader isr = null;
            BufferedReader br = null;
            while (true) {
                socket = ss.accept();
            /* 字节流*/
                ips = socket.getInputStream();
            /* 字符流*/
                isr = new InputStreamReader(ips);
            /* 字符流缓存*/
                br = new BufferedReader(isr);
                String info = null;
                while ((info = br.readLine()) != null) {
                    System.out.println(info);
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
