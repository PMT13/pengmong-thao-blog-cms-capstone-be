package net.yorksolutions.pengmongthaoblogcmscapstonebe.services;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Blog;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Chat;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Message;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.ChatRepository;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    MessageRepository repo;
    ChatRepository chatRepo;

    public MessageService(MessageRepository repo, ChatRepository chatRepo) {
        this.repo = repo;
        this.chatRepo = chatRepo;
    }

    public Iterable<Chat> addComment(Message request, Long chatId) {
        this.repo.save(request);
        Chat chat = this.chatRepo.findById(chatId).orElseThrow();
        chat.getMessages().add(request);
        this.chatRepo.save(chat);
        return this.chatRepo.findAll();
    }
}
