package com.yjn.icamp.reposirity;

import com.yjn.icamp.entity.Activity;
import com.yjn.icamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:39
 */
public interface ActivityRepository extends JpaRepository<Activity,Integer> {
    public  Activity findByActivityName(String name);
}
