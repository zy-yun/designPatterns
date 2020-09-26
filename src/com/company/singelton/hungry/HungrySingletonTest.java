package com.company.singelton.hungry;

/**
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 21:49
 */

public class HungrySingletonTest implements Runnable {
    @Override
    public void run() {
        HungrySingelton instance = HungrySingelton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
