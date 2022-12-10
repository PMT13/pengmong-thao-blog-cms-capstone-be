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
    @Column(columnDefinition="TEXT")
    private String body;
    private Long creatorId;
    private String backgroundColor;
    private String fontColor;
    private String fontStyle;
    private Long fontSize;
    @Column(columnDefinition="TEXT")
    private String imageURL;
    @ElementCollection
    private Set<String> views;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Comment> comments;

    public Blog() {
    }

    public Blog(String title, String dateCreated, String body, Long creatorId, String backgroundColor, String fontColor, String imageURL, String fontStyle, Long fontSize) {
        this.title = title;
        this.dateCreated = dateCreated;
        this.dateUpdated = "";
        this.body = body;
        this.creatorId = creatorId;
        this.backgroundColor = backgroundColor;
        this.views = new HashSet<>();
        this.comments = new HashSet<>();
        this.fontColor = fontColor;
        this.fontStyle = fontStyle;
        this.imageURL = imageURL;
        this.fontSize = fontSize;
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

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Long getFontSize() {
        return fontSize;
    }

    public void setFontSize(Long fontSize) {
        this.fontSize = fontSize;
    }
}
