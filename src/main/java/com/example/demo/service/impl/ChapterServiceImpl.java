package com.example.demo.service.impl;


import com.example.demo.dao.ChapterMapper;
import com.example.demo.model.Chapter;
import com.example.demo.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2018/8/27 17:32
 * Description :
 */
@Service
public class ChapterServiceImpl implements ChapterService{
    @Autowired
    private ChapterMapper chapterMapper;
    @Override
    public int insertSelective(Chapter record) {

        if(chapterMapper.selectByName(record.getChapterName())!=null){
            System.out.println("有重复");
            return -1;
        }
        return chapterMapper.insertSelective(record);
    }

}
