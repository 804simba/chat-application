package com.simba.chat.domain.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document
public class ChatRoom {

    @Id
    private String id;

    private String chatId;

    private String senderId;

    private String recipientId;
}
