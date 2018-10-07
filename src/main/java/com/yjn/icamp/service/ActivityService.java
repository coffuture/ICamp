package com.yjn.icamp.service;

import com.yjn.icamp.entity.Activity;
import com.yjn.icamp.reposirity.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:44
 */

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    public Activity showActivityDetail(String activityName){
        return activityRepository.findByActivityName(activityName);
    }

    public List<Activity> showActivityList(){
        return activityRepository.findAll();
    }

    public List<Activity> showActivityListByOptions(){
        //根据符合条件查询，待实现。
        return null;
    }

    public Activity create(Activity activity){
        return activityRepository.save(activity);
    }

    public Long showEnrolment(String activityName){
        return activityRepository.findByActivityName(activityName).getEnrolment();
    }


}
