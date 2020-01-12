package com.example.demo.dao.permission.user;

import com.example.demo.model.permission.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/9/28.
 */
public interface UserDao {


    // 添加用户
    int addUser(User users);

    // 更新用户信息
    int updateUser(User users);

    // 根据uid修改用户状态-删除和恢复接口
    int setStatus(@Param("uid") int uid, @Param("status") String status);

    // 根据uid获取用户
    User getUserByUid(int uid);



    // 根据用户名密码查询用户。相当于登录了
    User getUserByNameAndPwd(@Param("username") String name, @Param("password") String password);


    // 根据名字怕判断用户是否存在
    User getUserByUserName(@Param("username") String name);



    // 根据状态查询所有的用户
    List<User> getUsers(@Param("start") int start, @Param("size")int size, @Param("status")String status, @Param("name") String name);

    // 获取数据总量
    int getCount(@Param("status")String status, @Param("name") String name);

    // 修改密码
    int updatePwd(@Param("username") String username,
                  @Param("password") String password,
                  @Param("oldPwd") String oldPwd);
}
