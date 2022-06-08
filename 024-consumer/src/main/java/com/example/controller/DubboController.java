package com.example.controller;

import com.haha.model.Student;
import com.haha.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/5/3 15:41
 */

@RestController
public class DubboController {

    //@DubboReference(interfaceClass = StudentService.class,version = "1.0")
    @DubboReference(version = "1.0")
    private StudentService studentService;

    @GetMapping("/query")
    public String queryStudent(){

        Student student = studentService.queryStudent(20);
        return student.toString();

    }

}
