package com.walkwind.springboot2.singleton;

import java.io.IOException;
import java.util.Properties;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: Singleton3
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-27 15:37
 **/
public class Singleton3 {
    public static final Singleton3 SINGLETON3;
    private String name;
    static {
        Properties properties = new Properties();
        try {//从配置文件中取值并在创建单例实例时set到属性中
            properties.load(Singleton3.class.getClassLoader().getResourceAsStream("singletonResource.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        SINGLETON3 = new Singleton3((String) properties.get("name"));
    }
    private Singleton3(String name) {//提供私有的构造器
        this.name = name;
    }

    public static Singleton3 getSINGLETON3() {
        return SINGLETON3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}