package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "My First Spring Boot API";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String helloWorld2() {
        return "My First POST API";
    }
}

