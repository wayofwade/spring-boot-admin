package com.example.demo.dao.permission.user;

import com.example.demo.model.permission.user.User;

import java.util.List;

/**
 * Created by Administrator on 2019/9/28.
 */
public interface UserDao {

    int addUser(User user);

    List<User> getUsers(int start, int size, String status, String username);

    int getCount(String status, String username);

    int setStatus(int uid, String status);
}
