package net.yorksolutions.pengmongthaoblogcmscapstonebe.controllers;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Chat;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.services.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin
public class ChatController {

    ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @GetMapping("/{username}")
    public Iterable<Chat> getChatsByUsername(@PathVariable String username){
        return this.service.getChatsByUsername(username);
    }

    @PostMapping
    public Chat createChat(@RequestBody Chat request){
        return this.service.createChat(request);
    }

    @PutMapping
    public Chat updateChat(@RequestBody Chat request){
        return this.service.updateChat(request);
    }

    @DeleteMapping("/{id}")
    public void deleteChatById(@PathVariable Long id){
        this.service.deleteChatById(id);
    }
}
