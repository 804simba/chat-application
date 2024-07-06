package com.simba.chat.web.service.impl;

import com.simba.chat.domain.document.User;
import com.simba.chat.domain.enums.Status;
import com.simba.chat.domain.repository.UserRepository;
import com.simba.chat.web.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        user.setStatus(Status.ONLINE);
        userRepository.save(user);
    }

    @Override
    public void disconnectUser(User user) {
        try {
            User savedUser = userRepository.findById(user.getNickName()).orElse(null);
            if (savedUser != null) {
                savedUser.setStatus(Status.OFFLINE);
                userRepository.save(savedUser);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    @Override
    public List<User> findConnectedUsers() {
        return userRepository.findAllByStatus(Status.ONLINE);
    }
}
