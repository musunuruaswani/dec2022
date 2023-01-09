package com.example.dec2022.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController1 {
    @GetMapping("/greet/{name}")
    public String sayHello(@PathVariable("name") String inputName){
        return "HELLO" + inputName +" ,WELCOME TO SPRINGBOOT FRAMEWORK";
    }
}
