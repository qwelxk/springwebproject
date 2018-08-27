package com.example.demo.service.impl;


import com.example.demo.dao.StudentClassMapper;
import com.example.demo.model.StudentClass;
import com.example.demo.model.StudentClassKey;
import com.example.demo.service.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2018/8/25 20:37
 * Description :
 */
@Service
public class StudentClassServiceImpl implements StudentClassService{
    @Autowired
    private StudentClassMapper studentClassMapper;


    @Override
    public int insertSelective(StudentClass record) {
        StudentClassKey studentClassKey = new StudentClassKey();
        System.out.println(record.getClassName());
        System.out.println(record.getStName());
        studentClassKey.setStName(record.getStName());
        studentClassKey.setClassName(record.getClassName());
        if(studentClassMapper.selectByPrimaryKey(studentClassKey)!=null){
            System.out.println("有重复");
            return -1;
        }
        return studentClassMapper.insertSelective(record);
    }
}
