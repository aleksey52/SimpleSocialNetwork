package com.aleksey52.SimpleSocialNetwork.service;

import com.aleksey52.SimpleSocialNetwork.domain.User;

public interface UserService {
    User findById(long id);
    User findByUserName(String userName);
    User save(User user);
    void deleteById(long id);
}
