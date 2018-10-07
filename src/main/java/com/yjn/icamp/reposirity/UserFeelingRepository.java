package com.yjn.icamp.reposirity;

import com.yjn.icamp.entity.User;
import com.yjn.icamp.entity.UserFeeling;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:40
 */
public interface UserFeelingRepository extends JpaRepository<UserFeeling,Integer> {
    public UserFeeling findByUsernameAndActivityId(String name , Integer id);
}
