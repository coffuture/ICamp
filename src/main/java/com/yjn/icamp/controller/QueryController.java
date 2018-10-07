package com.yjn.icamp.controller;

import com.yjn.icamp.entity.*;
import com.yjn.icamp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午2:46
 */

@RestController
@RequestMapping(value = "/api/v1/query")
public class QueryController {
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

    @GetMapping(value="/activity")
    public Activity showActivityDetail(@RequestParam("activityName") String activityName){
        return activityService.showActivityDetail(activityName);
    }

    @GetMapping(value="/activitylist")
    public List<Activity> showActivityList(){
        return activityService.showActivityList();
    }

    @GetMapping(value = "/activity/enrolment")
    public  Long showEnrolment(@RequestParam("activityName") String activityName){
        return activityService.showEnrolment(activityName);
    }

    @GetMapping(value = "/camp")
    public Camp showCampDetail(@RequestParam("campName") String campName){
        return  campService.showCampDetail(campName);
    }

    @GetMapping(value = "/teacher")
    public Teacher showTeacherDetail(@RequestParam("id") Integer id, @RequestParam("teacherName") String teacherName){
        return  teacherService.showTeacherDetail(id,teacherName);
    }

    @GetMapping(value = "/order")
    public Order showOrderDetail(@RequestParam("orderNumber") Long orderNumber){
        return  orderService.showOrderDetail(orderNumber);
    }

    @GetMapping(value = "/userFeeling")
    public UserFeeling showUserFeelDetail(@RequestParam("username") String username, @RequestParam("activityId") Integer activityId){
        return  userFeelingService.showUserFeelDetail(username,activityId);
    }




}
