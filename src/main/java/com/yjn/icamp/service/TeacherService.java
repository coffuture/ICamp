package com.yjn.icamp.service;

import com.yjn.icamp.entity.Teacher;
import com.yjn.icamp.reposirity.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:44
 */
@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public Teacher showTeacherDetail(Integer id,String name){
        return teacherRepository.findByIdAndTeacherName(id,name);
    }

    public  Teacher create(Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
