package com.example.demo.dao;

import com.example.demo.model.StudentClass;
import com.example.demo.model.StudentClassKey;
import org.springframework.stereotype.Component;

@Component
public interface StudentClassMapper {
    int deleteByPrimaryKey(StudentClassKey key);

    int insert(StudentClass record);

    int insertSelective(StudentClass record);

    StudentClass selectByPrimaryKey(StudentClassKey key);

    int updateByPrimaryKeySelective(StudentClass record);

    int updateByPrimaryKey(StudentClass record);
}