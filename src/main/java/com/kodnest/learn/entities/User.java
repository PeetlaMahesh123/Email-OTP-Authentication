package com.kodnest.learn.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column(name = "Phone_num")
    private int phone;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "password")
    private String password;

    // Default Constructor
    public User() {
    }

    // Parameterized Constructor
    public User(int id, String name, int phone, String emailId, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.emailId = emailId;
        this.password = password;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}