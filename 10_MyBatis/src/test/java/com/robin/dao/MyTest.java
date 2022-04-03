package com.robin.dao;

import com.robin.mapper.UserMapper;
import com.robin.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    //查询所有用户信息
    @Test
    public void getUsers() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.getUsers();
        System.out.println(users);
    }

    //获取所有的用户信息：使用继承SqlSessionDaoSupport方式
    @Test
    public void getUsers3()  {
        // 获取上下文信息，得到Spring的IOC容器
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从IOC容器中获取UserMapper的Bean信息（说明类型后就不需要强制转换了）
        UserMapper userMapper = context.getBean("userMapper2",UserMapper.class);
        // 调用getUsers获取所有用户，然后进行遍历
        for (User user : userMapper.getUsers()) {
            System.out.println(user);
        }
    }
}