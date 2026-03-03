package com.intelligence.registration.controller;

import com.intelligence.registration.service.user.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public

}