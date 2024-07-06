package com.simba.chat.domain.payload;

import lombok.*;
import org.springframework.messaging.handler.annotation.SendTo;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatNotification {

    private String chatId;

    private String senderId;

    private String recipientId;

    private String content;
}
