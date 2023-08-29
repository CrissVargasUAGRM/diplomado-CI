package com.nur.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Users")
public class UserJpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USER")
    private UUID id;

    @Column(nullable = false, name = "USER_NAME")
    private String username;

    @Column(nullable = false, name = "EMAIL")
    private String email;

    @Column(nullable = false, name = "ACCOUNT_TYPE")
    private String accountType;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}