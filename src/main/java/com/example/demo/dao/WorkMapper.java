package com.example.demo.dao;

import com.example.demo.model.Work;
import org.springframework.stereotype.Component;

@Component
public interface WorkMapper {
    int insert(Work record);

    int insertSelective(Work record);
}