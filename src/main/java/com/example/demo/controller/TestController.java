package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/redMsql")
    public List<Map<String, Object>> redMsql(){
        testService.redMysql();
        return testService.redMysql();
    }

    /*@RequestMapping("/writeRedis")
    public List<Map<String, Object>> writeRedis(){
        testService.redMysql();
        return testService.redMysql();
    }*/

}
