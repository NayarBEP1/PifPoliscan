package com.poliscan.application.handler.command;

public class CommandUser {

    private String name;
    private String lastName;
    private String email;
    private String pass;

    public CommandUser(String name, String lastName, String email, String pass){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }
}
