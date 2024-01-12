package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.service.Userservice;

@RestController
public class UserController {
     
    @Autowired
    private Userservice userservice;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userservice.getAllUsers();
    }

    @PostMapping("/users")
    public User craetUser(@RequestBody User user){
        return userservice.createUser(user);
    }
}
