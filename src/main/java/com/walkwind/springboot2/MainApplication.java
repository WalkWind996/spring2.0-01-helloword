package com.walkwind.springboot2;

import com.walkwind.springboot2.controller.mode.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: com.walkwind.springboot2.MainApplication
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-18 22:59
 **/
@SpringBootApplication  // 来标注一个主程序类，说明这是一个Spring Boot应用
@EnableConfigurationProperties(User.class)
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}