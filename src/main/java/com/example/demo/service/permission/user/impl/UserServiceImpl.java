package com.example.demo.service.permission.user.impl;

import com.example.demo.dao.permission.user.UserDao;
import com.example.demo.model.permission.user.User;
import com.example.demo.service.permission.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/9/28.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        System.out.println(user);
        return userDao.addUser(user);
    }

    @Override
    public List<User> getUsers(int start, int size, String status, String name) {
        return null;
    }

    @Override
    public int getCount(String status, String name) {
        return 0;
    }

    @Override
    public int setStatus(int uid, String status) {
        return 0;
    }
}
