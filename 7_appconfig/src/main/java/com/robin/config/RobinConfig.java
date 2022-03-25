package com.robin.config;

import com.robin.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //他本来也是Component类， 代表这个是一个配置类 == beans.xml
@ComponentScan("com.robin.pojo")
public class RobinConfig {

    //注册一个bean, 等于之前写的bean标签
    //这个方法的名字等价于 bean 以前的id
    //返回值就是 bean中的class属性
    @Bean
    public User getUser(){
        return new User();//返回要注入的对象
    }
}
