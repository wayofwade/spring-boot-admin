package com.example.demo.controller.permission.user;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.common.CommonRes;
import com.example.demo.model.common.CommonSearch;
import com.example.demo.model.permission.user.ListUserRes;
import com.example.demo.model.permission.user.User;
import com.example.demo.service.permission.user.UserService;
import com.example.demo.util.CommonUtil;
import com.example.demo.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2019/9/28.
 */
@RestController
@RequestMapping(value="/permission/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test",produces = "text/plain;charset=UTF-8")
    String index(){
        // testService.testMybatis();
        return "Hello Spring Boot!testetee";
    }

    /**
     * 保存用户
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", method= RequestMethod.POST )
    public CommonRes addUser(@RequestBody User user){
        CommonRes res = userService.addOrUpdate(user);
        return res;
    }


    /**
     * 测试统一错误处理
     * @param a
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/error", method= RequestMethod.GET)
    public JSONObject error(CommonSearch a){
        return CommonUtil.errorJson(ErrorEnum.E_500);
    }


    /**
     * 删除用户
     * @param commonSearch
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/del", method= RequestMethod.POST)
    public CommonRes delUser(@RequestBody CommonSearch commonSearch){
        CommonRes res = new CommonRes();

        int uid = commonSearch.getId();
        String status = commonSearch.getStatus();
        if (uid == 0 || status == "" || status == null) {
            res.setCode(1004);
            res.setErrorInfo("请检查uid或者status是否正确");
            return res;
        }

        res = userService.setStatus(uid, status);
        return res;
    }


    /**
     * 根据条件获取用户数据
     * @param commonSearch
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/list", method= RequestMethod.POST)
    public ListUserRes getList(@RequestBody CommonSearch commonSearch){
        int start = commonSearch.getStart();
        int size = commonSearch.getSize();
        String status = commonSearch.getStatus();
        String name = commonSearch.getName();

        ListUserRes res = userService.getUsers(start,size,status,name);
        return res;
    }

}
