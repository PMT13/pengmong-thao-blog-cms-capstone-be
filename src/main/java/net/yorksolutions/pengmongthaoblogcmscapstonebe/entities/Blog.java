package net.yorksolutions.pengmongthaoblogcmscapstonebe.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private String dateCreated;
    private String dateUpdated;
    private String body;

    @ElementCollection
    private Set<String> views;

    @OneToMany()
    private Set<Comment> comments;

    public Blog() {
    }

    public Blog(String title, String dateCreated, String body) {
        this.title = title;
        this.dateCreated = dateCreated;
        this.dateUpdated = "";
        this.body = body;
        this.views = new HashSet<>();
        this.comments = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Set<String> getViews() {
        return views;
    }

    public void setViews(Set<String> views) {
        this.views = views;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
