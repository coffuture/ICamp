package com.yjn.icamp.controller;

import com.yjn.icamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author: yjn
 * @Date: 2018/10/3
 */

@RestController
@RequestMapping(value = "/api/v1")
public class MainController {


    @Autowired
    private UserService userService;

    @PostMapping(value = "/register")
    public Map<String,String> register(@RequestParam("name")String name, @RequestParam("password") String password){
//      public Map<String,String> register(@RequestBody String name, String password){
        return userService.register(name,password);
    }

    @PostMapping(value = "/login")
    public Map<String,String> login(@RequestParam("name")String name, @RequestParam("password") String password){
//      public Map<String,String> login(@RequestBody String name, String password){
        return userService.login(name,password);
    }





}
