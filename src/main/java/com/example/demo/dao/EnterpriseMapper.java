package com.example.demo.dao;

import com.example.demo.model.Enterprise;
import org.springframework.stereotype.Component;

@Component
public interface EnterpriseMapper {
    int deleteByPrimaryKey(Integer enterpriseId);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(Integer enterpriseId);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}