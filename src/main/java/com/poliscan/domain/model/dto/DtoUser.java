package com.poliscan.domain.model.dto;

public class DtoUser {

    private String id;
    private String name;
    private String lastName;
    private String email;

    public DtoUser(String id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
