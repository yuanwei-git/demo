package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*@Autowired
    private RedisUtil redisUtil;*/


    public List<Map<String, Object>> redMysql() {
        String sql = "select * from tb1";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

   /* public void writeRedis() {
        if(!redisUtil.hasKey("name")){
            redisUtil.set("name","张三");
            System.out.println(redisUtil.get("name"));
        }

    }*/

}
