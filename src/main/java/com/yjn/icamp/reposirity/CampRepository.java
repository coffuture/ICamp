package com.yjn.icamp.reposirity;

import com.yjn.icamp.entity.Camp;
import com.yjn.icamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:39
 */
public interface CampRepository extends JpaRepository<Camp,Integer> {
    public Camp findByCampName(String name);
}
