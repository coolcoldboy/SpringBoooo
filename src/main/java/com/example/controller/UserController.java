package com.example.controller;


import com.example.Service.UserService;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/api/user")
    public User queryUserById(Long id) {
        return userService.findUserById(id);
    }
}
