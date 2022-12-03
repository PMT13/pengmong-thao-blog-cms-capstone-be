package net.yorksolutions.pengmongthaoblogcmscapstonebe.controllers;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Blog;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.services.BlogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blog")
@CrossOrigin
public class BlogController {

    BlogService service;

    public BlogController(BlogService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public Iterable<Blog> getAllBlogs(){
        return this.service.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlogById(@PathVariable Long id){
        return this.service.getBlogById(id);
    }

    @PostMapping
    public Blog createBlog(@RequestBody Blog request){
        return this.service.createBlog(request);
    }

    @PutMapping
    public Blog updateBlog(@RequestBody Blog request){
        return this.service.updateBlog(request);
    }
}
