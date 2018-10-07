package com.yjn.icamp.service;

import com.yjn.icamp.entity.Camp;
import com.yjn.icamp.reposirity.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:44
 */
@Service
public class CampService {
    @Autowired
    CampRepository campRepository;

    public Camp showCampDetail(String campName){
        return campRepository.findByCampName(campName);
    }

    public Camp create(Camp camp){
        return campRepository.save(camp);
    }
}
