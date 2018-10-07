package com.yjn.icamp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author: yjn
 * @Date: 2018/10/6
 */
@Entity
@Data
@Table(name = "order1")
public class Order {
    @Id
    @GeneratedValue
    private Integer id;

    private Long orderNumber;

    private Date time;

    private String orderContent;



}
