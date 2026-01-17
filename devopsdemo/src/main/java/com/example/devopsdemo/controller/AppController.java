package com.example.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation marks the class as a REST controller
@RestController // Means this class will handle HTTP requests
public class AppController {

    @GetMapping("/health")      // Listen for GET requests at /health
    public String health() {
        return "UP";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps";
    }
}
