package com.company;

import com.company.singelton.hungry.HungrySingelton;
import com.company.singelton.hungry.HungrySingletonTest;
import com.company.singelton.lazy.LazyDoubleSynSingletonTest;
import com.company.singelton.lazy.LazySingletonTest;
import com.company.singelton.lazy.LazyStaticSingletonTest;
import com.company.singelton.register.ContainerSingelton;
import com.company.singelton.seriable.SeriableSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, IOException {
	// write your code here
        //单例模式之饿汉模式测试
//        Thread thread1 = new Thread(new HungrySingletonTest());
//        Thread thread2 = new Thread(new HungrySingletonTest());
//        thread1.start();
//        thread2.start();
//        System.out.println("---------------end-----------------");
//
//        Class<?> clazz = HungrySingelton.class;
//        Constructor<?> c = clazz.getDeclaredConstructor(null);
//        c.setAccessible(true);
//        Object o1 = c.newInstance();
//        Object o2 = c.newInstance();
//
//        System.out.println("利用反射破坏单例："+o1);
//        System.out.println("利用反射破坏单例："+o2);


        //单例模式之懒汉模式加锁测试
//        Thread thread1 = new Thread(new LazySingletonTest());
//        Thread thread2 = new Thread(new LazySingletonTest());
//        thread1.start();
//        thread2.start();
//        System.out.println("---------------end-----------------");


        //单例模式之懒汉模式 静态内部类模式测试
//        Thread thread1 = new Thread(new LazyStaticSingletonTest());
//        Thread thread2 = new Thread(new LazyStaticSingletonTest());
//        thread1.start();
//        thread2.start();
//        System.out.println("---------------end-----------------");


        //单例模式之懒汉双重锁模式测试
//        Thread thread1 = new Thread(new LazyDoubleSynSingletonTest());
//        Thread thread2 = new Thread(new LazyDoubleSynSingletonTest());
//        thread1.start();
//        thread2.start();
//        System.out.println("---------------end-----------------");

        //单例模式之注册式 IOC容器模式测试
//        Object instance1 = ContainerSingelton.getInstance("com.company.singelton.register.ContainerPoJoTest");
//        Object instance2 = ContainerSingelton.getInstance("com.company.singelton.register.ContainerPoJoTest");
//        System.out.println("单例模式之容器式单例："+(instance1==instance2));

        //防止序列化破坏单例模式测试
//        SeriableSingleton instanceRead = null;
//        SeriableSingleton instance = SeriableSingleton.getInstance();
//        FileOutputStream outputStream = new FileOutputStream("tt.obj");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(instance);
//        objectOutputStream.flush();
//        objectOutputStream.close();
//
//        FileInputStream fileInputStream = new FileInputStream("tt.obj");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        instanceRead = (SeriableSingleton)objectInputStream.readObject();
//        objectInputStream.close();
//
//        System.out.println("防止序列化破坏单例："+(instance==instanceRead));



    }
}
