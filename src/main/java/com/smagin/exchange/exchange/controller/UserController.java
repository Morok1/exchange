package com.smagin.exchange.exchange.controller;

import com.smagin.exchange.exchange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;


}
