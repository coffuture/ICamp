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
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue
    private Integer id;

    private String activityName;

    private String activityContent;

    private String activityTopic;

    //报名人数
    private  Long enrolment;
}
