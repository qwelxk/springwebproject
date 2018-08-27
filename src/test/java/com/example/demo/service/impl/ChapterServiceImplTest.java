package com.example.demo.service.impl;

import com.example.demo.model.Chapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2018/8/27 20:22
 * Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ChapterServiceImplTest {
    @Autowired
    ChapterServiceImpl chapterServiceImpl;
    @Test
    public void insertSelective() {
        Chapter chapter = new Chapter();
        chapter.setChapterName("chapter3");
        chapter.setChapterManager("xiaohong");
        chapter.setChapterCheck("create");
        chapterServiceImpl.insertSelective(chapter);
    }
}