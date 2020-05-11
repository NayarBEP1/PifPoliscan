package com.poliscan.domain.databuilder;

import com.poliscan.domain.model.entity.User;

public class UserDataBuilder {

    private String name;
    private String lastName;
    private String email;
    private String pass;

    public UserDataBuilder() {
        this.name = "Brayan";
        this.lastName = "Estrada";
        this.email = "brayan.estrada@ceiba.com.co";
        this.pass = "password8characters";
    }

    public UserDataBuilder userWithName(String name){
        this.name = name;
        return this;
    }

    public UserDataBuilder userWithLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserDataBuilder userWithEmail(String email){
        this.email = email;
        return this;
    }

    public UserDataBuilder userWithPass(String pass){
        this.pass = pass;
        return this;
    }

    public User build(){
        return new User(this.name, this.lastName, this.email, this.pass);
    }


}
