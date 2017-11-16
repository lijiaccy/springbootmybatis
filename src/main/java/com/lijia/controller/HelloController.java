package com.lijia.controller;

import com.alibaba.fastjson.JSON;
import com.lijia.bean.User;
import com.lijia.service.HelloService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;

@Controller
@RequestMapping("/hello")
public class HelloController {


    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestParam String username){
        User user = helloService.get(username);
        if(user!=null){
            System.out.println("user.getName():"+user.getUsername());
        }
        return JSON.toJSONString(user);

    }
    @RequestMapping(value = "/exception")
    @ResponseBody
    public String exception(){
        throw new RuntimeException();
    }

    @ApiOperation(value = "测试swagger2",notes = "测试swagger2")
    @RequestMapping(value = "/swagger",method = RequestMethod.GET)
    @ResponseBody
    public String swagger(){
        return "helloWorld";
    }
}
