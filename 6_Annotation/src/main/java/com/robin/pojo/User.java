package com.robin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 等价于<bean id = "user" class = "com.robin.pojo.User">
@Component
public class User {

    public String name;

    //相当于<property name = "name" value = "Yijian Li">
    @Value("Yijian Li")
    public void setName(String name) {
        this.name = name;
    }
}
