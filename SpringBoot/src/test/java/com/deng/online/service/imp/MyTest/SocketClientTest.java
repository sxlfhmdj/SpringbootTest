package com.deng.online.service.imp.MyTest;

import java.io.*;
import java.net.Socket;

/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 10:38 2017/5/22 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class SocketClientTest {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("127.0.0.1", 8989);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Hello");
            bw.flush();
            socket.shutdownOutput();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
