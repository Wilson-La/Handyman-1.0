package com.handyman.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="user", uniqueConstraints = {
        @UniqueConstraint(columnNames = "username")
})
public class User {

    @Id
    @Column(name="userid")
    private int id;
    @Column(name="username")
    @Basic
    private String username;
    @Column(name="password")
    @Basic
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

}
