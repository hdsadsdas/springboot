package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/28 18:54
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;


    @RequestMapping("/student")
    @ResponseBody
    public String addStudent(String name,Integer age){

        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        int rows = studentService.addStudent(student);

        return "添加学生" + rows;

    }


}
