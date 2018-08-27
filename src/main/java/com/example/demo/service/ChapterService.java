package com.example.demo.service;

import com.example.demo.model.Chapter;
import org.springframework.stereotype.Service;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2018/8/27 17:32
 * Description :
 */
@Service
public interface ChapterService {

    int insertSelective(Chapter record);
}
