package com.example.demo.controller.chart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/9/28.
 */
@RestController
@RequestMapping(value="/chart")
public class ChartController {

    @ResponseBody
    @RequestMapping(value = "/test")
    String index(){
        // testService.testMybatis();
        return "Hello Spring Boot!chartttt";
    }
}
