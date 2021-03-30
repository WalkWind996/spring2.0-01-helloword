package com.walkwind.springboot2.test;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: TestMethod
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-25 15:33
 **/
@FunctionalInterface
public interface TestMethod {

    int sum(int x, int y);

    static void staticMethod(){
        System.out.println("接口中的静态方法");
    }

    default String defaultMethod(){
        return "接口中的默认方法";
    }
}