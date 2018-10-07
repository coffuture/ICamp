package com.yjn.icamp.service;


import com.yjn.icamp.entity.User;
import com.yjn.icamp.reposirity.UserRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public Map<String,String> register(String username, String password){
        Map<String,String> map = new HashMap<>();
        Random random = new Random();
        if (StringUtils.isBlank(username)){
            map.put("msg","用户名不能为空");
            return map;
        }

        if (StringUtils.isBlank(password)){
            map.put("msg","密码不能为空");
            return map;
        }

        User u = userRepository.findByName(username);
        if (u!=null){
            map.put("msg","用户名已经被占用");
            return map;
        }

        User user = new User();
        user.setName(username);
        user.setSalt(UUID.randomUUID().toString().substring(0,5));
        user.setPassword(DigestUtils.md5Hex(password+user.getSalt()));
        userRepository.save(user);
        map.put("msg","注册成功");

        return map;
    }

    public Map<String,String> login(String username, String password){
        Map<String,String> map = new HashMap<>();
        if (StringUtils.isBlank(username)){
            map.put("msg","用户名不能为空");
            return map;
        }

        if (StringUtils.isBlank(password)){
            map.put("msg","密码不能为空");
            return map;
        }

        User u = userRepository.findByName(username);
        if (u==null){
            map.put("msg","用户名不存在");
            return map;
        }

        if (!DigestUtils.md5Hex(password+u.getSalt()).equals(u.getPassword())){
            map.put("msg","密码错误");
            return map;
        }

        map.put("msg","登录成功");

        return map;
    }



}
