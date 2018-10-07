package com.yjn.icamp.controller;

import com.yjn.icamp.entity.*;
import com.yjn.icamp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午2:47
 */
@RestController
@RequestMapping(value = "/api/v1/create")
public class CreateController {

    @Autowired
    ActivityService activityService;

    @Autowired
    CampService campService;

    @Autowired
    OrderService orderService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    UserFeelingService userFeelingService;

    @PostMapping(value = "/activity")
    public Activity createActivity(@ModelAttribute Activity activity){
        return activityService.create(activity);
    }

    @PostMapping(value = "/camp")
    public Camp createCamp(@ModelAttribute Camp camp){return  campService.create(camp);}

    @PostMapping(value = "/order")
    public Order createOrder(@ModelAttribute Order order){
        order.setTime(new Date());
        return  orderService.create(order);
    }

    @PostMapping(value = "/teacher")
    public Teacher createTeacher(@ModelAttribute Teacher teacher){return  teacherService.create(teacher);}

    @PostMapping(value = "/userFeeling")
    public UserFeeling createUserFeeling(@ModelAttribute UserFeeling userFeeling){return  userFeelingService.create(userFeeling);}


}
