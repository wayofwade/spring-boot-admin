package com.example.demo.controller.permission.user;

import com.example.demo.model.common.CommonRes;
import com.example.demo.model.common.CommonSearch;
import com.example.demo.model.permission.user.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2019/9/28.
 */
@RestController
@RequestMapping(value="/user")
public class UserController {

    @RequestMapping(value = "/test",produces = "text/plain;charset=UTF-8")
    String index(){
        // testService.testMybatis();
        return "Hello Spring Boot!testetee";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method= RequestMethod.POST)
    public CommonRes addUser(@RequestBody User user){
        CommonRes res = new CommonRes();
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
