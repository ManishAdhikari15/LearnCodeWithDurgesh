package com.lcwd.User.controller;

import com.lcwd.User.model.User;
import com.lcwd.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/saveUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1=service.saveuser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/getuser/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id){
        User user=service.user(id);
        return ResponseEntity.ok(user);

    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUsers=service.allUsers();
        return ResponseEntity.ok(allUsers);
    }
}
