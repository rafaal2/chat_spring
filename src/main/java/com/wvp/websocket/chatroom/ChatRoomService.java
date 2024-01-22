package com.wvp.websocket.chatroom;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;
    public Optional<String> getChatRoomId(String senderId,
                                          String recipientId,
                                          Boolean createNewRoomIfNotExists) {


        return chatRoomRepository.findBySenderIdAndRecipientId(senderId, recipientId).map(ChatRoom::getChatId)
                .or(() ->){
            if (createNewRoomIfNotExists){
                var
            }
            return Optional.empty();
        }


    }
}
