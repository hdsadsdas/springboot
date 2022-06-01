package com.haha.dao;

import com.haha.model.Student;
import org.apache.ibatis.annotations.Mapper;

//@Mapper

public interface StudentDao {

    Student selectById(Integer id);

}
