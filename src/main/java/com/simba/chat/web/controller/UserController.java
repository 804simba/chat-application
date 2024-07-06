package com.simba.chat.web.controller;

import com.simba.chat.domain.document.User;
import com.simba.chat.web.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @MessageMapping("/user.addUser")
    @SendTo("/user/topic")
    public User addUser(@Payload User user) {
        userService.saveUser(user);
        return user;
    }

    @MessageMapping("/user.disconnectUser")
    @SendTo("/user/topic")
    public String disconnectUser(@Payload User user) {
        userService.disconnectUser(user);
        return "User disconnected successfully";
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> findConnectedUsers() {
        return userService.findConnectedUsers();
    }
}
