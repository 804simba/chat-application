package com.simba.chat.web.service;

import com.simba.chat.domain.document.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void disconnectUser(User user);
    List<User> findConnectedUsers();
}
