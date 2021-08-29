package com.aleksey52.SimpleSocialNetwork.service.impl;

import com.aleksey52.SimpleSocialNetwork.domain.Message;
import com.aleksey52.SimpleSocialNetwork.domain.User;
import com.aleksey52.SimpleSocialNetwork.repository.MessageRepository;
import com.aleksey52.SimpleSocialNetwork.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    private MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> findByUser(User user) {
        return messageRepository.findByUser(user);
    }

    @Override
    public List<Message> findByAddressee(User addressee) {
        return messageRepository.findByAddressee(addressee);
    }

    @Override
    public Message save(Message message) {
        message.setBody(message.getBody().trim());
        if (!message.getBody().equals("")) {
            messageRepository.save(message);
        }

        return message;
    }

    @Override
    public void deleteById(long id) {
        messageRepository.deleteById(id);
    }
}
