package com.aleksey52.SimpleSocialNetwork.service.impl;

import com.aleksey52.SimpleSocialNetwork.domain.User;
import com.aleksey52.SimpleSocialNetwork.repository.UserRepository;
import com.aleksey52.SimpleSocialNetwork.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public User save(User user) {
        user.setUserName(user.getUserName().trim());
        if (!user.getUserName().equals("")) {
            userRepository.save(user);
        }

        return user;
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }
}
