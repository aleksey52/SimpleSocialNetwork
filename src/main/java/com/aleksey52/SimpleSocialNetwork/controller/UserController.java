package com.aleksey52.SimpleSocialNetwork.controller;

import com.aleksey52.SimpleSocialNetwork.domain.User;
import com.aleksey52.SimpleSocialNetwork.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/user_by_name/{username}")
    public ResponseEntity<User> findByUserName(@PathVariable("username") String userName) {
        return new ResponseEntity<>(userService.findByUserName(userName), HttpStatus.OK);
    }

    @PostMapping("/create")
    public User newUser(User user) {
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") long id) {
        userService.deleteById(id);
    }
}
