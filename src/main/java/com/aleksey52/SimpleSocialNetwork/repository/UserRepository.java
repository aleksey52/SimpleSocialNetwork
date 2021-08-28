package com.aleksey52.SimpleSocialNetwork.repository;

import com.aleksey52.SimpleSocialNetwork.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
    User findByUserName(String userName);
}
