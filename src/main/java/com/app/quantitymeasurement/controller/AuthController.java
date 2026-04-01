package com.app.quantitymeasurement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.quantitymeasurement.service.AuthService;
import com.app.quantitymeasurement.model.LoginRequest;
import com.app.quantitymeasurement.model.SignupRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    //  Google success
    @GetMapping("/success")
    public String success() {
        return "Login Successful";
    }

    //  Signup
    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
        return authService.signup(request);
    }

    //  Login
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}