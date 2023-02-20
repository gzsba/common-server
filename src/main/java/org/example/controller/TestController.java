package org.example.controller;

import org.example.model.UserInfo;
import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public int test(@RequestBody UserInfo info){
        int res = testService.test(info);
        System.out.println("返回结果："+res);
        return res;
    }
}
