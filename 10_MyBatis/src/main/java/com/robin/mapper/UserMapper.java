package com.robin.mapper;
import com.robin.pojo.User;
import java.util.List;

public interface UserMapper {
    // 查询所有用户信息
    public List<User> getUsers();

}