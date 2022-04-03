package com.robin.mapper;

import com.robin.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();

    //add
    public int addUser(User user);

    //delete
    public int deleteUser(int id);
}
