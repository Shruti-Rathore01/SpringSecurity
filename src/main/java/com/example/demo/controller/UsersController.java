package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user)
    {
        return service.register(user);
    }

}
