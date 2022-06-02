package com.example.service.impl;

import com.example.dao.StudentMapper;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/28 18:47
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Transactional //用来表示有事务的支持
    @Override
    public int addStudent(Student student) {

        System.out.println("业务方法addStudent");
        int rows = studentMapper.insert(student);

        System.out.println("执行sql语句");

        //抛出一个运行异常  目的是回滚事务

        //int m = 10/0;



        return rows;

    }
}
