package com.aleksey52.SimpleSocialNetwork.controller;

import com.aleksey52.SimpleSocialNetwork.domain.User;
import com.aleksey52.SimpleSocialNetwork.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") String id) {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public User addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable("id") String id, @RequestBody User user) {
        userService.findById(id); //need exception
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") String id) {
        userService.deleteById(id);
    }
}
