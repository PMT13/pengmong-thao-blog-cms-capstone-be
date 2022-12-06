package net.yorksolutions.pengmongthaoblogcmscapstonebe.controllers;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Blog;
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

    @PostMapping("/{blogId}")
    public Iterable<Blog> addComment(@RequestBody Comment request, @PathVariable Long blogId){
        return this.service.addComment(request, blogId);
    }

    @PutMapping
    public Iterable<Blog> updateComment(@RequestBody Comment request){
        return this.service.updateComment(request);
    }

    @DeleteMapping("/{blogId}/{commentId}")
    public Iterable<Blog> deleteCommentById(@PathVariable Long blogId, @PathVariable Long commentId){
        return this.service.deleteCommentById(blogId,commentId);
    }
}
