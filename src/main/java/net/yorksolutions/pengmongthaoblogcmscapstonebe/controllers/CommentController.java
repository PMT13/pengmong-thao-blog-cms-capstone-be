package net.yorksolutions.pengmongthaoblogcmscapstonebe.controllers;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Comment;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.services.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
@CrossOrigin
public class CommentController {

    CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping
    public Comment addComment(@RequestBody Comment request){
        return this.service.addComment(request);
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment request){
        return this.service.updateComment(request);
    }

    @DeleteMapping("/{id}")
    public void deleteCommentById(@PathVariable Long id){
        this.service.deleteCommentById(id);
    }
}
