package com.yjn.icamp.reposirity;

import com.yjn.icamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LiuHaoiang
 * @date 2018/1/31 14:28
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    public  User findByName(String name);
}
