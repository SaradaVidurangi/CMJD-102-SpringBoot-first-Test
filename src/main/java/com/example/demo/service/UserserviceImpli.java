package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class UserserviceImpli implements Userservice{
    @Autowired
    private UserRepository UserRepository;

    @Override
    public List<User> getAllUsers(){
        return UserRepository.findAll();
    }

    @Override
    public User createUser(User user){
        return UserRepository.save(user);
    }
    @Override
    public User getUserbyId(Long id){
        return UserRepository.findById(id).orElse(null);
    }

    



}
 