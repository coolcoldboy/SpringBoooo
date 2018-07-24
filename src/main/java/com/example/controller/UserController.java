package com.example.controller;


import com.example.Service.UserService;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/api/user")
    public User queryUserById(Long id) {
        return userService.findUserById(id);
}


    @RequestMapping(value = "/api/updatealbumID", method = {RequestMethod.GET, RequestMethod.POST})
    public int updateTempAlbumID(Long id) {
        int a = userService.updateTempAlbumID(id);
        return a;
    }
}
