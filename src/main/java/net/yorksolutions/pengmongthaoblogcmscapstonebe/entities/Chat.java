package net.yorksolutions.pengmongthaoblogcmscapstonebe.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String person1;
    private String person2;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<Message> messages;

}
