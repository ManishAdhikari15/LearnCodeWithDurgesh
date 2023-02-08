package com.lcwd.User.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_micro")
public class User {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name",length = 20)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "about")
    private String about;
}
