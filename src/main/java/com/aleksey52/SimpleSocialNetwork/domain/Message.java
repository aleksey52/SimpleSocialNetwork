package com.aleksey52.SimpleSocialNetwork.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "addressee_id")
    private User addressee;

    @Column
    private String body;

    @Column
    private Date creationTime;

    public Message(User user, User addressee, String body, Date creationTime) {
        this.user = user;
        this.addressee = addressee;
        this.body = body;
        this.creationTime = creationTime;
    }
}
