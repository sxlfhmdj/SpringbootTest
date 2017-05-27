package com.deng.online.service.imp;


/**
 * Description: 【方法功能中文描述】 <br/>
 * Created on 10:40 2017/5/16 <br/>
 *
 * @author: <a href="mailto: dengjiang@camelotchina.com">邓江</a><br/>
 * @version: 1.0 <br/>
 * Copyright (c) 2017年 北京柯莱特科技有限公司 交付部
 */
public class MainTest {

    private int globalNum;

    public static void main(String[] args){
        MainTest mainTest = new MainTest();
        mainTest.test();
    }


    public void test() {
        Runnable ict = new IncreaseThread();
        Runnable ret = new ReduceThread();
        for (int i = 0; i < 2; i++) {
            new Thread(ict).start();
            new Thread(ret).start();
        }
    }

    public class IncreaseThread implements Runnable{
        @Override
        public void run() {
            increase();
        }
    }

    public class ReduceThread implements Runnable{
        @Override
        public void run() {
            reduce();
        }
    }

    public synchronized void increase(){
        for (int i = 0; i < 100; i++) {
            globalNum ++;
            System.out.println(Thread.currentThread().getName() + ":" + globalNum );
        }
    }

    public  void reduce(){
        for (int i = 0; i < 100; i++) {
            globalNum --;
            System.out.println(Thread.currentThread().getName() + ":" + globalNum );
        }
    }

}

