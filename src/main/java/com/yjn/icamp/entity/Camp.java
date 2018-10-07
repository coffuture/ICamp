package com.yjn.icamp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: yjn
 * @Date: 2018/10/5
 */
@Entity
@Data
@Table(name = "camp")
public class Camp {
    @Id
    @GeneratedValue
    private Integer id;

    private String campName;

    private String position;
}
