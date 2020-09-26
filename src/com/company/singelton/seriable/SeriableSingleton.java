package com.company.singelton.seriable;

import java.io.Serializable;

/**
 * 防止序列化破坏单例模式写法
 *
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 23:47
 */

public class SeriableSingleton implements Serializable {

    private SeriableSingleton(){

    }

    private static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }


    /**
     * 重写readResolve方法，防止序列化破坏单例模式
     * @return
     */
    private Object readResolve(){
        return seriableSingleton;
    }
}
