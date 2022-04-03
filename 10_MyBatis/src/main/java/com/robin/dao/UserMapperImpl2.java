package com.robin.dao;


import com.robin.pojo.User;
import com.robin.mapper.UserMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;

//UserMapperImpl2实现类直接继承SqlSessionDaoSupport
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    //重写getUsers方法
    public List<User> getUsers() {
/*
	   // 获取sqlSession对象
        SqlSession sqlSession = getSqlSession();
        // 获取Mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 返回到userMapper接口的getUsers方法中
        return mapper.getUsers();*/
        // 上面三行代码的精简版
        return  getSqlSession().getMapper(UserMapper.class).getUsers();
    }
}

