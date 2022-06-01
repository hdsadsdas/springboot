package com.haha.service.impl;

import com.haha.dao.StudentDao;
import com.haha.model.Student;
import com.haha.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/4/28 14:38
 */

@Service
public class  StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {

        Student student = studentDao.selectById(id);

        return student;
    }
}
