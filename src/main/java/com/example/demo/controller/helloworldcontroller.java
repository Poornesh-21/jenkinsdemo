package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class helloworldcontroller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hi, Poornesh!";
    }
}
