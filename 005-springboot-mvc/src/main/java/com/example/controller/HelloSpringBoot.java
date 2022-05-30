package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/25 17:53
 */

@Controller
public class HelloSpringBoot {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot(){

        return "HELLO";

    }

}
