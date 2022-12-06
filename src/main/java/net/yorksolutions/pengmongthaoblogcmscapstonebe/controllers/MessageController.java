package net.yorksolutions.pengmongthaoblogcmscapstonebe.controllers;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Blog;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Chat;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Comment;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Message;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.services.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/message")
@CrossOrigin
public class MessageController {
    MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping("/{chatId}")
    public Iterable<Chat> addMessage(@RequestBody Message request, @PathVariable Long chatId){
        return this.service.addComment(request, chatId);
    }
}
