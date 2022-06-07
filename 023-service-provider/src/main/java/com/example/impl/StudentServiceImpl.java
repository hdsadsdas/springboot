package com.example.impl;

import com.haha.model.Student;
import com.haha.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/5/3 15:20
 */

//@Component
@DubboService(interfaceClass = StudentService.class,version = "1.0",timeout = 5000)
public class StudentServiceImpl implements StudentService {

    @Override
    public Student queryStudent(Integer id) {

        Student student = new Student();
        student.setId(id);
        student.setAge(20);
        student.setName("haha");

        return student;
    }
}
