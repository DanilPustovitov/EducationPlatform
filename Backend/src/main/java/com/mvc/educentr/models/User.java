package com.mvc.educentr.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String initials;

    private String email;

    private String password;

    public String getPassword() {
        return password;
    }

    public User(String initials, String email, String password) {
        this.initials = initials;
        this.email = email;
        this.password = password;
    }

    public User() {}
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
