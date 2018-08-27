package com.example.demo.service.impl;

import com.example.demo.model.StudentClass;
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
 * @date : 2018/8/27 18:32
 * Description :
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentClassServiceImplTest {
    @Autowired
    StudentClassServiceImpl studentClassServiceImpl;
    @Test
    public void insertSelective() {
        StudentClass studentClass = new StudentClass();
        studentClass.setStName("zhaoliu");
        studentClass.setClassName("class1");
        studentClass.setStuClassCheck("ok");
        studentClassServiceImpl.insertSelective(studentClass);
    }
}