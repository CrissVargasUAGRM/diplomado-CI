package com.nur.model;

import com.nur.core.BusinessRuleValidationException;
import com.nur.core.Entity;

import java.util.UUID;

public class Personas extends Entity {
    public String name;
    public String lastName;
    public String ci;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Personas(String name, String lastName, String ci) {
        id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
    }

    public Personas() {
    }
}
