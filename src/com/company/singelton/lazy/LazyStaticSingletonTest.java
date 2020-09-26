package com.company.singelton.lazy;

/**
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 22:47
 */

public class LazyStaticSingletonTest implements Runnable {
    @Override
    public void run() {
        LazyStaticSingleton instance = LazyStaticSingleton.getInstance();
        System.out.println("单例模式之静态内部类："+Thread.currentThread().getName()+":"+instance);
    }
}
