package com.yjn.icamp.reposirity;

import com.yjn.icamp.entity.Teacher;
import com.yjn.icamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:40
 */
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    public Teacher findByIdAndTeacherName(Integer id,String name);
}
