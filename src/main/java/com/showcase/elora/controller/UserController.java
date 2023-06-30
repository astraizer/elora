package com.showcase.elora.controller;


import com.showcase.elora.persistance.model.User;
import com.showcase.elora.persistance.vo.request.LoginRequest;
import com.showcase.elora.persistance.vo.request.UserVO;
import com.showcase.elora.service.AuthenticationService;
import com.showcase.elora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    private final AuthenticationService authenticationService;
    @Autowired
    public UserController(UserService userService,AuthenticationService authenticationService) {
        this.userService = userService;
        this.authenticationService=authenticationService;
    }

    @GetMapping("/")
    public List<User> getUsers(){
        return this.userService.getAllUser();
    }

    @PostMapping("/login")
    public String login(LoginRequest request){
        return this.authenticationService.authenticate(request.login, request.password);
    }

    @PostMapping("/register")
    public User register(UserVO request){
        return this.userService.register(request);
    }
}
