package com.company.singelton.lazy;

/**
 * 单例模式之懒汉模式
 * 函数加锁：优点：节省内存空间，线程安全
 *          缺点：1.函数加锁，性能差 2.反射可破坏
 *
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 22:07
 */

public class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton lazySingleton = null;

    /**
     * 对外函数 加锁，保证线程安全
     * @return
     */
    public synchronized static LazySingleton getInstance() {

        if (lazySingleton == null) {
            //如果不加锁，此处会有线程安全问题
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
