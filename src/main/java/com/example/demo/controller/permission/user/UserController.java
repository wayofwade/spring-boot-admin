package com.example.demo.controller.permission.user;

import com.example.demo.model.common.CommonRes;
import com.example.demo.model.common.CommonSearch;
import com.example.demo.model.permission.user.User;
import com.example.demo.service.permission.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2019/9/28.
 */
@RestController
@RequestMapping(value="/user")
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
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", method= RequestMethod.GET)
    public CommonRes addUser(@RequestParam Map<String,String> map){
        CommonRes res = new CommonRes();
        User user = new User();
        user.setUsername("chenlaocong");
        user.setPassword("123456");
        user.setStatus("1");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        int code = userService.addUser(user);
        if (code == 0){
            res.setMsgInfo("保存错误！！");
        }
        return res;
    }


    @ResponseBody
    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public CommonRes getList(CommonSearch a){
        CommonRes res = new CommonRes();
        return res;
    }





    @ResponseBody
    @RequestMapping(value = "/list2", method= RequestMethod.GET)
    public CommonRes getList2(@RequestParam String a){
        CommonRes res = new CommonRes();
        return res;
    }


}
