package com.company.factory;

/**
 * @author: create by zhangyun
 * @version: v1.0
 * @description: 工厂设计模式 测试；缺点：不易扩展      应用：candar 日历工厂
 * @date:2020/9/16 22:12
 */

public class FactoryMain {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ICourse iCourse = new CourseFactory().create(JavaCourse.class);
        iCourse.record();
        ICourse iCourse1 = new CourseFactory().create(PythonCourse.class);
        iCourse1.record();
    }
}
