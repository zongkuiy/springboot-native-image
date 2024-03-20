package com.nativeapp.demo.controller;


import com.nativeapp.demo.dao.SysUserMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/demo")
public class DemoController {

    @Autowired
    SysUserMapper userMapper;

    @RequestMapping(value = "/case1", method = RequestMethod.GET)
    @ResponseBody
    public Object case1() {
        return userMapper.selectByExample(null);

    }

}

