package com.example.controllers;

import com.example.entities.User;
import com.example.repository.UsersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersRepository repo;

    public UsersController(UsersRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<com.example.entities.User> getAllUsers() {
        return repo.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody com.example.entities.User user) {
        return repo.save(user);
    }


//    @GetMapping("/{name}")
//    public com.example.models.User getGreeting(@PathVariable String name) {
//        return new com.example.models.User("0", name);
//    }
//
//    @PostMapping()
//    public String postGreeting(@RequestBody com.example.models.User request){
//        return "Created user: " + request.getName();
//    }
}