package net.yorksolutions.pengmongthaoblogcmscapstonebe.entities;

import javax.persistence.*;
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
}
