package net.yorksolutions.pengmongthaoblogcmscapstonebe.services;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Comment;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    CommentRepository repo;

    public CommentService(CommentRepository repo) {
        this.repo = repo;
    }

    public Comment addComment(Comment request){
        return this.repo.save(request);
    }
    public Comment updateComment(Comment request) {
        return this.repo.save(request);
    }

    public void deleteCommentById(Long id) {
        Comment commentToDelete = this.repo.findById(id).orElseThrow();
        this.repo.delete(commentToDelete);
    }
}
