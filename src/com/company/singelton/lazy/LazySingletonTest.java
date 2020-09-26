package com.company.singelton.lazy;

/**
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 22:16
 */

public class LazySingletonTest implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("懒汉模式加锁："+Thread.currentThread().getName()+":"+instance);
    }
}
