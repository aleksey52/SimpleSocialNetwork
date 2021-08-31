package com.aleksey52.SimpleSocialNetwork.service;

import com.aleksey52.SimpleSocialNetwork.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(String id);
    User save(User user);
    void deleteById(String id);
}
