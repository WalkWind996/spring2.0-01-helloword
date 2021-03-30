package com.walkwind.springboot2.singleton;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: Singleton2
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-27 14:44
 **/
//枚举类中的构造为私有构造
public enum Singleton2 {
    INSTANCE;   //编译后为public static final Singleton2 INSTANCE;
                //直接使用Singleton2.INSTANCE获取对象
}
