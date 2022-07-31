package com.lzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/xxx")
public class UserController {
    //请求地址 http://localhost:8080/xxx/quick
    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username=123"})
    public String tiaoZhuan(){
        System.out.println("UserController的save方法运行....");
        return"/WoDeWangYe.jsp";
    }
}
