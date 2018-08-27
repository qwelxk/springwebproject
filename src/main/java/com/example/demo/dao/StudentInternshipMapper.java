package com.example.demo.dao;

import com.example.demo.model.StudentInternship;
import com.example.demo.model.StudentInternshipKey;
import org.springframework.stereotype.Component;

@Component
public interface StudentInternshipMapper {
    int deleteByPrimaryKey(StudentInternshipKey key);

    int insert(StudentInternship record);

    int insertSelective(StudentInternship record);

    StudentInternship selectByPrimaryKey(StudentInternshipKey key);

    int updateByPrimaryKeySelective(StudentInternship record);

    int updateByPrimaryKey(StudentInternship record);
}