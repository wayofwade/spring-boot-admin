package com.example.demo.model.permission.user;

import java.util.Date;

/**
 * Created by Administrator on 2019/9/28.
 * 用户的实体类
 */
public class User {
    private int uid;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;

    // 默认创建的时候为1
    private String status = "1";

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
