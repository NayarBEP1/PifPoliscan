package com.poliscan.infrastructure.databuilder;

import com.poliscan.application.handler.command.CommandUser;

public class CommandUserDataBuilder {

    private String name;
    private String lastName;
    private String email;
    private String pass;

    public CommandUserDataBuilder() {
        this.name = "Brayan";
        this.lastName = "Estrada";
        this.email = "brayan.estrada@ceiba.com.co";
        this.pass = "password8characters";
    }

    public CommandUser createUser(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser createUserWithoutName(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser createUserWithoutLastName(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser createUserWithoutEmail(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser createUserWithoutPassword(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser build(){
        return new CommandUser(this.name, this.lastName, this.email, this.pass);
    }


}
