package com.fj.service;

import com.fj.dao.UserDao;
import com.fj.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;
    public User getUserById(String userId) {
        return this.userDao.getUserById(userId);
    }

    public void save(User user) {
        userDao.insert(user);
    }

    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
