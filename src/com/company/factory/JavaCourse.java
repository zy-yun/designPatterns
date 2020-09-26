package com.company.factory;

/**
 * java课程录制实现类
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
