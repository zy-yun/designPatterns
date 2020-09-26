package com.company.singelton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式之容器式单例，模拟IOC
 * 优点：可以存放多个单例对象，节省内存，线程安全，优雅
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 23:28
 */

public class ContainerSingelton {

    private ContainerSingelton(){

    }

    private static final Map<String,Object> containerIocMap = new ConcurrentHashMap<String,Object>();


    public static Object getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //判断是否需要阻塞
        if (!containerIocMap.containsKey(className)){
            synchronized (ContainerSingelton.class){
                //再次检查是否需要创建对象
                if (!containerIocMap.containsKey(className)){
                    containerIocMap.put(className,Class.forName(className).newInstance());
                }
            }

        }
        return containerIocMap.get(className);
    }
}
