package com.company.singelton.hungry;

/**
 * 单例模式之饿汉模式
 * 优点：线程安全,执行效率高，没有锁
 * 缺点: 单例较多时浪费内存
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 21:44
 */

public class HungrySingelton {

    private static final HungrySingelton hungrySingelton = new HungrySingelton();

    /**
     * 构造方法私有化
     */
    private HungrySingelton(){

    }

    public static HungrySingelton getInstance(){

        return hungrySingelton;
    }


}
