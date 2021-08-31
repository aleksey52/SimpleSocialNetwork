package com.aleksey52.SimpleSocialNetwork.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "usr")
public class User {
    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String picture;

    @Column
    private String email;

    @Column
    private String locale;


    public User(String id, String name, String firstName, String lastName, String picture, String email, String locale) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.picture = picture;
        this.email = email;
        this.locale = locale;
    }
}
