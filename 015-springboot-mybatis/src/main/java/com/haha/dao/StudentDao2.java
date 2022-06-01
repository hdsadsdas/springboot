package com.haha.dao;

import com.haha.model.Student;


//xml和dao分开
public interface StudentDao2 {

    Student selectById(Integer id);

}
