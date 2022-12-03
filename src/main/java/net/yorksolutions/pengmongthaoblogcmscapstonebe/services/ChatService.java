package net.yorksolutions.pengmongthaoblogcmscapstonebe.services;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Chat;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.ChatRepository;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    ChatRepository repo;

    public ChatService(ChatRepository repo) {
        this.repo = repo;
    }

    public Iterable<Chat> getChatsByUsername(String username) {
        return this.repo.findAllByPerson1OrPerson2(username,username);
    }

    public Chat createChat(Chat request) {
        return this.repo.save(request);
    }

    public Chat updateChat(Chat request) {
        return this.repo.save(request);
    }

    public void deleteChatById(Long id) {
        Chat chatToDelete = this.repo.findById(id).orElseThrow();
        this.repo.delete(chatToDelete);
    }
}
