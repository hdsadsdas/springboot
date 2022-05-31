package com.exampler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/27 17:26
 */

@Controller
public class BootController {

    @RequestMapping("/a")
    @ResponseBody
    public String userAccount(){

        return "/user/a";

    }

    @RequestMapping("/login")
    @ResponseBody
    public String userLogin(){
        return "/user/login";
    }

}
