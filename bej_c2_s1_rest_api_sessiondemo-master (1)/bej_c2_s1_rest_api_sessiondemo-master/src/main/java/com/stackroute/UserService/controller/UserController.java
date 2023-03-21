package com.stackroute.UserService.controller;


import com.stackroute.UserService.model.User;

import com.stackroute.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserService userService;



    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody User user){
            return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

}
