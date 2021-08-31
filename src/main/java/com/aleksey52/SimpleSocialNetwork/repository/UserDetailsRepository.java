package com.aleksey52.SimpleSocialNetwork.repository;

import com.aleksey52.SimpleSocialNetwork.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, String> {
}
