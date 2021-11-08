package com.example.test.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String sayHello() {
        return "index";
    }
}
