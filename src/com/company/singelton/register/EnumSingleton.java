package com.company.singelton.register;

/**
 * 单例模式之注册式单例
 * 优点：线程安全、反射不能破坏
 * 缺点： 单例过多时会造成内存浪费，优化点参考spring的IOC容器
 * @author: create by zhangyun
 * @version: v1.0
 * @description:
 * @date:2020/9/23 23:18
 */

public enum  EnumSingleton {

    /**
     * 会预先创建好对象，并放到一个concurrentHashMap容器中去，可以创建多个
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
