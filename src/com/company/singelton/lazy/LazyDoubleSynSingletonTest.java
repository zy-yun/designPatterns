package com.company.singelton.lazy;

/**
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 23:10
 */

public class LazyDoubleSynSingletonTest implements Runnable {
    @Override
    public void run() {
        LazyDoubleSynSingleton instance = LazyDoubleSynSingleton.getInstance();
        System.out.println("单例模式之懒汉双重锁模式："+Thread.currentThread().getName()+":"+instance);
    }
}
