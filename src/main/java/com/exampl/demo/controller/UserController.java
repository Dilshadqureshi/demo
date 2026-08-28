package com.exampl.demo.controller;


import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class UserController {

    @GetMapping
    public String userName(){
        return "Subhanallah";
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return user;
    }
}
