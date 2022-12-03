package net.yorksolutions.pengmongthaoblogcmscapstonebe.entities;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String creator;
    private String body;
    private String dateCreated;
    private int chatOrder;
}
