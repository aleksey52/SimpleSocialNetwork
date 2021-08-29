package com.aleksey52.SimpleSocialNetwork.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    public User(String userName, String password, String firstName, String middleName, String lastName) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
