package com.example.demo.service.permission.user;

import com.example.demo.model.common.CommonRes;
import com.example.demo.model.permission.user.ListUserRes;
import com.example.demo.model.permission.user.User;

import java.util.List;

/**
 * Created by Administrator on 2019/9/28.
 */
public interface UserService {

    int addUser(User user);


    // 添加或者更新
    CommonRes addOrUpdate(User user);

    ListUserRes getUsers(int start, int size, String status, String name);

    int getCount(String status, String name);

    // 删除或者恢复
    CommonRes setStatus(int uid, String status);

}
