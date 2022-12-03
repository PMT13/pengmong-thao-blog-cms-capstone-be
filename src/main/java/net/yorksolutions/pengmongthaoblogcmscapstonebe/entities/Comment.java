package net.yorksolutions.pengmongthaoblogcmscapstonebe.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String creator;
    private String dateCreated;
    private String dateUpdated;
    private String body;

    @ElementCollection
    private Set<String> likes;

    public Comment() {
    }

    public Comment(String creator, String dateCreated, String body) {
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.dateUpdated = "";
        this.body = body;
        this.likes = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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

    public Set<String> getLikes() {
        return likes;
    }

    public void setLikes(Set<String> likes) {
        this.likes = likes;
    }
}
