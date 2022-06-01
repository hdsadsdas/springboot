package com.haha.controller;

import com.haha.dao.StudentDao2;
import com.haha.model.Student;
import com.haha.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/28 14:40
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public String queryStudent(Integer id){

        Student student = studentService.queryStudent(id);

        return student.toString();

    }

    @Resource
    private StudentDao2 studentDao2;

    @RequestMapping("/student2")
    @ResponseBody
    public String queryStudent2(Integer id){

        Student student = studentDao2.selectById(id);

        return student.toString();

    }

}
