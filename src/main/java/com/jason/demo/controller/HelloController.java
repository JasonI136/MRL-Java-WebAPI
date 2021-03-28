package com.jason.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/add")
    public int Add(@RequestParam(value = "n1", defaultValue = "0") int n1, @RequestParam(value = "n2", defaultValue = "0")  int n2)
    {
        return n1 + n2;
    }

    @RequestMapping("/subtract")
    public int Subtract(@RequestParam(value = "n1", defaultValue = "0") int n1, @RequestParam(value = "n2", defaultValue = "0")  int n2)
    {
        return n1 - n2;
    }

    @RequestMapping("/multiply")
    public int Multiply(@RequestParam(value = "n1", defaultValue = "0") int n1, @RequestParam(value = "n2", defaultValue = "0")  int n2)
    {
        return n1 * n2;
    }

    @RequestMapping("/divide")
    public float Divide(@RequestParam(value = "n1", defaultValue = "0") int n1, @RequestParam(value = "n2", defaultValue = "0")  int n2)
    {
        return n1 / n2;
    }

}
