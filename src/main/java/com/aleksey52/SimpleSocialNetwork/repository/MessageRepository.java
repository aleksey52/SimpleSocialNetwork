package com.aleksey52.SimpleSocialNetwork.repository;

import com.aleksey52.SimpleSocialNetwork.domain.Message;
import com.aleksey52.SimpleSocialNetwork.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findByUser(User user);
    List<Message> findByAddressee(User addressee);
}
