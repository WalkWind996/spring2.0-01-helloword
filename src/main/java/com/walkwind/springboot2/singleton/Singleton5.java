package com.walkwind.springboot2.singleton;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: Singleton5
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-27 16:22
 **/
public class Singleton5 {
    private Singleton5(){
    }
    private Singleton5 getInstance(){
       return Inner.SINGLETON_5;
    }
    private static class Inner{
        private static final Singleton5 SINGLETON_5 = new Singleton5();
    }
}