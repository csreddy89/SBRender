package com.example.demo;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://frontendrender-ktnx.onrender.com")
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot 🚀";
    }
}