package net.yorksolutions.pengmongthaoblogcmscapstonebe.services;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Blog;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Comment;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.BlogRepository;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    CommentRepository repo;
    BlogRepository blogRepo;
    public CommentService(CommentRepository repo, BlogRepository blogRepo) {
        this.repo = repo;
        this.blogRepo = blogRepo;
    }

    public Iterable<Blog> addComment(Comment request, Long blogId){
        this.repo.save(request);
        Blog blog = this.blogRepo.findById(blogId).orElseThrow();
        blog.getComments().add(request);
        this.blogRepo.save(blog);
        return this.blogRepo.findAll();
    }
    public Iterable<Blog> updateComment(Comment request) {
        this.repo.save(request);
        return this.blogRepo.findAll();
    }

    public Iterable<Blog> deleteCommentById(Long blogId, Long commentId) {
        Comment commentToDelete = this.repo.findById(commentId).orElseThrow();
        Blog blog = this.blogRepo.findById(blogId).orElseThrow();
        blog.getComments().remove(commentToDelete);
        this.blogRepo.save(blog);
        this.repo.delete(commentToDelete);
        return this.blogRepo.findAll();
    }
}
