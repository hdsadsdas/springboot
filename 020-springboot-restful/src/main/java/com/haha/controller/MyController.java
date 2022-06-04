package com.haha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/29 16:07
 */

@RestController
public class MyController {


    @GetMapping("/student/{id}")
    public String queryStudent(@PathVariable(value = "id") Integer id) {

        return "学生id=" + id;

    }

    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name,
                                @PathVariable("age") Integer age) {

        return "创建Student"+name+"age="+age;

    }

}
