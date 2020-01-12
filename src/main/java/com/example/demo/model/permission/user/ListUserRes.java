package com.example.demo.model.permission.user;

import com.example.demo.model.common.CommonRes;

import java.util.List;

/**
 * Created by chenlaocong on 2020/1/12.
 */
public class ListUserRes extends CommonRes{
    private List<User> list;

    private int total;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
