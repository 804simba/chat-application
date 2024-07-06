package com.simba.chat.domain.repository;

import com.simba.chat.domain.document.ChatRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChatRoomRepository extends MongoRepository<ChatRoom, String> {
    Optional<ChatRoom> findChatRoomBySenderIdAndRecipientId(String senderId, String recipientId);
}
