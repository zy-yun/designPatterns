package com.company.factory;

/**
 * @author: create by zhangyun
 * @version: v1.0
 * @description: 工厂类，不宜生产多个对象，
 * @date:2020/9/16 22:05
 */

public class CourseFactory {

    /**
     * 创建对象方法，只允许 实现了ICourse接口的类对象
     * @param classez
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public ICourse create(Class<? extends ICourse> classez) throws IllegalAccessException, InstantiationException {
        if (null!=classez){
            return classez.newInstance();
        }else {
            return null;
        }

    }
}
