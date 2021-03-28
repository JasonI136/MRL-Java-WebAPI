package com.jason.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hw")

    public String getHelloWorld(){
        return "Hello World";
    }
}
