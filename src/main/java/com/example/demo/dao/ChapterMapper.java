package com.example.demo.dao;

import com.example.demo.model.Chapter;
import org.springframework.stereotype.Component;

@Component
public interface ChapterMapper {
    int deleteByPrimaryKey(Integer chapterId);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    Chapter selectByPrimaryKey(Integer chapterId);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKey(Chapter record);

    Chapter selectByName(String name);
}