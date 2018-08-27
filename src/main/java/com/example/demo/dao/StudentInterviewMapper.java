package com.example.demo.dao;

import com.example.demo.model.StudentInterview;
import org.springframework.stereotype.Component;

@Component
public interface StudentInterviewMapper {
    int insert(StudentInterview record);

    int insertSelective(StudentInterview record);
}