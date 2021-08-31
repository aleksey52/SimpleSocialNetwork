package com.aleksey52.SimpleSocialNetwork.controller;

import com.aleksey52.SimpleSocialNetwork.domain.Message;
import com.aleksey52.SimpleSocialNetwork.domain.User;
import com.aleksey52.SimpleSocialNetwork.service.impl.MessageServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    private final MessageServiceImpl messageService;

    public MessageController(MessageServiceImpl messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public ResponseEntity<List<Message>> findAll() {
        return new ResponseEntity<>(messageService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/message/{id}")
    public ResponseEntity<Message> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(messageService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/messages_by_user/{user}")
    public ResponseEntity<List<Message>> findByUser(@PathVariable("user") User user) {
        return new ResponseEntity<>(messageService.findByUser(user), HttpStatus.OK);
    }

    @GetMapping("/messages_by_addressee/{addressee}")
    public ResponseEntity<List<Message>> findByAddressee(@PathVariable("addressee") User addressee) {
        return new ResponseEntity<>(messageService.findByAddressee(addressee), HttpStatus.OK);
    }

    @PostMapping("/add")
    public Message addMessage(@RequestBody Message message) {
        return messageService.save(message);
    }

    @PutMapping("/update/{id}")
    public Message updateMessage(@PathVariable("id") long id, @RequestBody Message message) {
        messageService.findById(id); //need exception
        return messageService.save(message);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") long id) {
        messageService.deleteById(id);
    }
}
