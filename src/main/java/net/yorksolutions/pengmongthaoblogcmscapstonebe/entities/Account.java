package net.yorksolutions.pengmongthaoblogcmscapstonebe.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String username;
    private String password;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<Blog> blogs;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<Chat> chats;
}
