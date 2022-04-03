package com.robin.dao;

import com.robin.mapper.UserMapper;
import com.robin.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    /**
     * 在之前，我们的所有操作都使用sqlSession来执行，
     * 而现在都使用sqlSessionTemplate
     */
    // SqlSessionTemplate的set方法
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSession = sqlSessionTemplate;
    }

    // 重写getUsers方法
    public List<User> getUsers() {
        // 获取UserMapper对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 返回UserMapper对象的getUsers方法
        return userMapper.getUsers();
    }
}
