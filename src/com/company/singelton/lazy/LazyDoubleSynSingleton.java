package com.company.singelton.lazy;

/**
 * 单例模式之懒汉 双重锁模式
 * 优点：效率高，线程安全
 * 缺点：可读性难度加大，不够优雅，2.反射会破坏
 *
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 22:50
 */

public class LazyDoubleSynSingleton {

    //构造方法私有化
    private LazyDoubleSynSingleton(){}

    private static volatile LazyDoubleSynSingleton lazyDoubleSynSingleton = null;

    public static LazyDoubleSynSingleton getInstance(){
        //检查是否要阻塞
        if (null==lazyDoubleSynSingleton){
            synchronized (LazyDoubleSynSingleton.class){
                //检查是否要重新创建实例
                if (lazyDoubleSynSingleton==null){
                    //这里要防止指令重排序问题，加关键字volatile
                    lazyDoubleSynSingleton = new LazyDoubleSynSingleton();
                }
            }
        }

        return lazyDoubleSynSingleton;
    }
}
