package com.aleksey52.SimpleSocialNetwork.service;

import com.aleksey52.SimpleSocialNetwork.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long id);
    User findByUserName(String userName);
    User save(User user);
    void deleteById(long id);
}
