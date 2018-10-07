package com.yjn.icamp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: yjn
 * @Date: 2018/10/6
 */
@Entity
@Data
@Table(name = "user_feeling")
public class UserFeeling {
    @Id
    @GeneratedValue
    private Integer id;

    private String username;

    private Integer activityId;

    private String feelContent;
}
