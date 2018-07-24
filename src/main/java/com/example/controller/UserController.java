package com.example.controller;


import com.example.Service.UserService;
import com.example.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/api/user")
    public User queryUserById(Long id) {
        logger.info("queryUserById start");
        return userService.findUserById(id);
}


    @RequestMapping(value = "/api/updatealbumID", method = {RequestMethod.GET, RequestMethod.POST})
    public int updateTempAlbumID(Long id) {
        logger.info("updateTempAlbumID start");
        int a = userService.updateTempAlbumID(id);
        logger.info("updateTempAlbumID end");
        return a;
    }
}
