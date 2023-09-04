package com.nur.model;

import com.nur.core.AggregateRoot;
import com.nur.core.BusinessRuleValidationException;
import com.nur.valueObjects.EmailValueObject;
import com.nur.valueObjects.PasswordValueObject;

import java.util.UUID;

public class Usuario extends AggregateRoot {
    public String username;

    public String accountType;

    public EmailValueObject email;

    public PasswordValueObject pass;

    public UUID personId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getEmail() {
        return email.getValue();
    }

    public void setEmail(EmailValueObject email) {
        this.email = email;
    }

    public String getPass() {
        return pass.getValue();
    }

    public void setPass(PasswordValueObject pass) {
        this.pass = pass;
    }

    public UUID getPersonId() {
        return personId;
    }

    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    public Usuario() {
    }

    public Usuario(String username, String email, String pass, String accountType, UUID personId) throws BusinessRuleValidationException {
        id = UUID.randomUUID();
        this.username = username;
        this.email = new EmailValueObject(email);
        this.pass = new PasswordValueObject(pass);
        this.accountType = accountType;
        this.personId = personId;
    }
}
