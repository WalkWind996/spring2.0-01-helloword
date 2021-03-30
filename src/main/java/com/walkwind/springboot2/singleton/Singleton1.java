package com.walkwind.springboot2.singleton;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: Singleton
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-27 14:32
 **/
public class Singleton1 {
    public static final Singleton1 SINGLETON1 = new Singleton1();
    private Singleton1() {//提供私有的构造器
    }
    //可以通过类型直接获取对象这里getInstance方法可以省略
    public static Singleton1 getInstance() {
        return SINGLETON1;
    }
}