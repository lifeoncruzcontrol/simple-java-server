package com.example.controllers;

import com.example.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {
    @GetMapping("/{name}")
    public User getGreeting(@PathVariable String name) {
        return new User("0", name);
    }

    @PostMapping()
    public String postGreeting(@RequestBody User request){
        return "Created user: " + request.getName();
    }
}