package com.yjn.icamp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @Author: yjn
 * @Date: 2018/10/3
 */
@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String password;

    private String salt;

}

