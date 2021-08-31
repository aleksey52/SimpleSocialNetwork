package com.aleksey52.SimpleSocialNetwork.service.impl;

import com.aleksey52.SimpleSocialNetwork.domain.User;
import com.aleksey52.SimpleSocialNetwork.repository.UserDetailsRepository;
import com.aleksey52.SimpleSocialNetwork.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDetailsRepository userDetailsRepository;

    public UserServiceImpl(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    public List<User> findAll() {
        return userDetailsRepository.findAll();
    }

    @Override
    public User findById(String id) {
        return userDetailsRepository.findById(id).get();
    }

    @Override
    public User save(User user) {
        return userDetailsRepository.save(user);
    }

    @Override
    public void deleteById(String id) {
        userDetailsRepository.deleteById(id);
    }
}
