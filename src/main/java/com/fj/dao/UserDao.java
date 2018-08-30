package com.fj.dao;

import com.fj.pojo.User;

import java.util.List;

public interface UserDao {
    public User selectByPrimaryKey(String userId);

    void insert(User user);

    public User getUserById(String userId);

    List<User> findAllUser();
}
