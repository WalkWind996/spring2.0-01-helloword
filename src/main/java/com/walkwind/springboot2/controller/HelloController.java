package com.walkwind.springboot2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: HelloController
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-18 23:05
 **/
@RestController //是 @ResponseBody和@Controller的组合写法
public class HelloController {
        @RequestMapping("/hello")
        public String hello(){
            return "Hello, Spring Boot 2!";
        }
}