package com.example.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {
    @GetMapping("/{greeting}")
    public String getGreeting(@PathVariable String greeting){
        return greeting + "!";
    }