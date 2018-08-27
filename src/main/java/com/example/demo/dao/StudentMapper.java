package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}