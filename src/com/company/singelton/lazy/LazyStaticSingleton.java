package com.company.singelton.lazy;

/**
 * 单例模式之懒汉 静态内部类模式
 * 优点：相比较双重锁写法较优雅，利用java本身语法，静态内部类，使用时才会加载初始化,也节省内存空间
 * 缺点：也可以被反射破坏
 *
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 22:22
 */

public class LazyStaticSingleton {

    private LazyStaticSingleton() {
    }

    /**
     * 对外函数 返回挑用静态内部类的静态变量
     *
     * @return
     */
    public static LazyStaticSingleton getInstance() {
        return LazyHolder.lazyStaticSingleton;
    }


    /**
     * 静态内部类，只有在调用时才加载初始化
     */
    private static class LazyHolder {
        private static LazyStaticSingleton lazyStaticSingleton = new LazyStaticSingleton();
    }
}
