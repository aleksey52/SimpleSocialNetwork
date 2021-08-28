package com.aleksey52.SimpleSocialNetwork.service;

import com.aleksey52.SimpleSocialNetwork.domain.Message;
import com.aleksey52.SimpleSocialNetwork.domain.User;

import java.util.List;

public interface MessageService {
    List<Message> findByUser(User user);
    List<Message> findByAddressee(User addressee);
    Message save(Message message);
    void deleteById(long id);
}
