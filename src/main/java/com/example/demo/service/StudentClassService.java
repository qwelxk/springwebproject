package com.example.demo.service;


import com.example.demo.model.StudentClass;
import org.springframework.stereotype.Service;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2018/8/25 20:35
 * Description :
 */
@Service
public interface StudentClassService {

    int insertSelective(StudentClass record);

}
