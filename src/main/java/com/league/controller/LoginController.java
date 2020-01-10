package com.league.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class LoginController {


    @PostMapping("/login")
    public void login(){

    }

    @PostMapping("/logout")
    public void logout(){

    }

}
