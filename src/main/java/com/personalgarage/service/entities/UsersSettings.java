package com.personalgarage.service.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usersSettings")
public final class UsersSettings {

    @Id
    private String id;

    public UsersSettings() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}