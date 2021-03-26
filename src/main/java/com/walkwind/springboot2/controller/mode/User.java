package com.walkwind.springboot2.controller.mode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: User
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-23 11:19
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "friends")
public class User {

    private String userName;
    private Integer age;
    private String lastName;

}