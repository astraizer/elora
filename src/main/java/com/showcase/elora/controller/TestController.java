package com.showcase.elora.controller;

import com.showcase.elora.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final TestService testService;


    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/testing")
    public String getTesting(){
        return "Hello Not Authenticated!";
    }

    @PostMapping("/test")
    public String addTesting(){
        return testService.addTesting("test",1).toString();
    }
}
