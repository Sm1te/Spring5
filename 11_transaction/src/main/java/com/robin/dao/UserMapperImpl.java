package com.robin.dao;

import com.robin.mapper.UserMapper;
import com.robin.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
//    // 重写getUsers方法
//    public List<User> getUsers() {
//        return  getSqlSession().getMapper(UserMapper.class).getUsers();
//    }

    public List<User> getUsers() {
        User user = new User(3,"钟兴民","zxm123456");
        // 获取sqlSession对象，获取Mapper接口对象
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        userMapper.addUser(user);
        userMapper.deleteUser(6);
        // 调用接口的getUsers方法
        return userMapper.getUsers();
    }

    // 增加用户信息
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    // 通过id删除用户信息
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
