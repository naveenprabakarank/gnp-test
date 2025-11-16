package com.demotest.gnp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/")
    public String getResponse() {
        return "Welcome to Calci Buddy!!!";
    }
}
