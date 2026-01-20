package com.example.devopsdemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${app.version}")
    private String version;

    @Value("${spring.profiles.active}")
    private String environment;

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps v2";
    }

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
                "appName", appName,
                "version", version,
                "environment", environment
        );
    }
}
