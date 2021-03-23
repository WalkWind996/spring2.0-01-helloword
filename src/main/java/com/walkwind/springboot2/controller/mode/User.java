package com.walkwind.springboot2.controller.mode;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: User
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-23 11:19
 **/
@ConfigurationProperties(prefix = "user")
public class User {

    private String userName;
    private Integer age;

    public User() {
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}