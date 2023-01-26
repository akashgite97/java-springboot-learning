package com.earn.springsecurity.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HealthCheck {
    
    @GetMapping("/healthCheck")
    public String healthCheck(){
        return ("<h1>Healthcheck successful</h1>");
    }
}
