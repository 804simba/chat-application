package com.simba.chat.domain.repository;

import com.simba.chat.domain.document.User;
import com.simba.chat.domain.enums.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
