package com.yjn.icamp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: yjn
 * @Date: 2018/10/3
 */
@Entity
@Data
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue
    private Integer id;

    private String teacherName;

    private String teacherContent;
}
