package com.example.demo.dao;

import com.example.demo.model.Mclass;
import org.springframework.stereotype.Component;

@Component
public interface MclassMapper {
    int deleteByPrimaryKey(String className);

    int insert(Mclass record);

    int insertSelective(Mclass record);

    Mclass selectByPrimaryKey(String className);

    int updateByPrimaryKeySelective(Mclass record);

    int updateByPrimaryKey(Mclass record);
}