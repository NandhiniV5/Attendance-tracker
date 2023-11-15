package com.cts.attendance.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.attendance.dto.LoginRequest;
import com.cts.attendance.entity.UserCred;
import com.cts.attendance.repository.UserRepository;

@RestController
public class WelcomeController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("login")
    public String login(@RequestBody LoginRequest loginRequest) {
        UserCred user = userRepository.findByLoginName(loginRequest.getLoginName());

        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return "Login successful. Welcome, " + user.getLoginName() + "!";
        } else {
            return "Login failed. Invalid username or password.";
        }
    }
}
