package net.yorksolutions.pengmongthaoblogcmscapstonebe.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String person1;
    private String person2;
    private String lastVisitedPerson1;
    private String lastVisitedPerson2;
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<Message> messages;

    public Chat() {
    }

    public Chat(String person1, String person2, String lastVisitedPerson1, String lastVisitedPerson2) {
        this.person1 = person1;
        this.person2 = person2;
        this.lastVisitedPerson1 = lastVisitedPerson1;
        this.lastVisitedPerson2 = lastVisitedPerson2;
        this.messages = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerson1() {
        return person1;
    }

    public void setPerson1(String person1) {
        this.person1 = person1;
    }

    public String getPerson2() {
        return person2;
    }

    public void setPerson2(String person2) {
        this.person2 = person2;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    public String getLastVisitedPerson1() {
        return lastVisitedPerson1;
    }

    public void setLastVisitedPerson1(String lastVisitedPerson1) {
        this.lastVisitedPerson1 = lastVisitedPerson1;
    }

    public String getLastVisitedPerson2() {
        return lastVisitedPerson2;
    }

    public void setLastVisitedPerson2(String lastVisitedPerson2) {
        this.lastVisitedPerson2 = lastVisitedPerson2;
    }
}
