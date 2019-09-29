package com.example.demo.controller.permission.user;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.config.exception.GlobalExceptionHandler;
import com.example.demo.model.common.CommonRes;
import com.example.demo.model.common.CommonSearch;
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
     * @param
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





    @ResponseBody
    @RequestMapping(value = "/list2", method= RequestMethod.GET)
    public CommonRes getList2(@RequestParam String a){
        CommonRes res = new CommonRes();
        return res;
    }


}
