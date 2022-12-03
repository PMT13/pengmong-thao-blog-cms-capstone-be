package net.yorksolutions.pengmongthaoblogcmscapstonebe.services;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Blog;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    BlogRepository repo;

    public BlogService(BlogRepository repo) {
        this.repo = repo;
    }

    public Iterable<Blog> getAllBlogs() {
        return this.repo.findAll();
    }

    public Blog getBlogById(Long id) {
        return this.repo.findById(id).orElseThrow();
    }

    public Blog createBlog(Blog request) {
        this.repo.save(request);
        return request;
    }

    public Blog updateBlog(Blog request) {
        return this.repo.save(request);
    }

    public void deleteBlogById(Long id) {
        Blog blogToDelete = this.repo.findById(id).orElseThrow();
        this.repo.delete(blogToDelete);
    }
}
