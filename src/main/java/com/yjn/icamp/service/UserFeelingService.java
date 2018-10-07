package com.yjn.icamp.service;

import com.yjn.icamp.entity.UserFeeling;
import com.yjn.icamp.reposirity.UserFeelingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:45
 */
@Service
public class UserFeelingService {
    @Autowired
    UserFeelingRepository userFeelingRepository;

    public UserFeeling showUserFeelDetail(String userName, Integer activityId){
        return  userFeelingRepository.findByUsernameAndActivityId(userName,activityId);
    }

    public  UserFeeling create(UserFeeling userFeeling){
        return userFeelingRepository.save(userFeeling);
    }
}
