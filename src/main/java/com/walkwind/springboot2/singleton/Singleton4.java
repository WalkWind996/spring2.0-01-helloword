package com.walkwind.springboot2.singleton;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: Singleton4
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-27 16:22
 **/
public class Singleton4 {
    private volatile static  Singleton4 singleton=null;
    private Singleton4() {}
    public static Singleton4 getInstance() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}