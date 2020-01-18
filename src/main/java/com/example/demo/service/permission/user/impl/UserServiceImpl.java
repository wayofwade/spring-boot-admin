package com.example.demo.service.permission.user.impl;

import com.example.demo.dao.permission.user.UserDao;
import com.example.demo.model.common.CommonRes;
import com.example.demo.model.permission.user.ListUserRes;
import com.example.demo.model.permission.user.User;
import com.example.demo.service.permission.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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


    /**
     * 修改或者添加用户
     * @param user
     * @return
     */
    @Override
    public CommonRes addOrUpdate(User user) {
        CommonRes res = new CommonRes();
        Date time = new Date();
        user.setUpdateTime(time);
        /*
         * uid > 0 为更新。反之为添加
         */
        if (user.getUid() > 0) {

            int code = userDao.updateUser(user);
            if (code == 0) {
                res.setCode(1004);
                res.setErrorInfo("更新用户失败");
            }
        } else {
            user.setCreateTime(time);
            int code = userDao.addUser(user);
            if (code == 0) {
                res.setCode(1004);
                res.setErrorInfo("添加用户失败");
            }
        }
        return res;
    }

    /**
     * 获取用户的列表
     * @param start
     * @param size
     * @param status
     * @param name
     * @return
     */
    @Override
    public ListUserRes getUsers(int start, int size, String status, String name) {
        ListUserRes res = new ListUserRes();
        List<User> list = userDao.getUsers(start, size, status, name);
        int total = userDao.getCount(status, name);
        res.setList(list);
        res.setTotal(total);
        return res;
    }

    @Override
    public int getCount(String status, String name) {
        return 0;
    }


    /**
     * 删除用户
     * @param uid
     * @param status
     * @return
     */
    @Override
    public CommonRes setStatus(int uid, String status) {
        CommonRes res = new CommonRes();
        int code = userDao.setStatus(uid,status);
        if (code == 0) {
            res.setCode(1004);
            res.setErrorInfo("删除失败");
        }
        return res;
    }
}
