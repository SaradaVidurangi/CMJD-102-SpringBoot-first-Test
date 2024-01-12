package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface Userservice {
    List<User> getAllUsers();
    User createUser(User user);
    User getUserbyId(Long Id);

}
