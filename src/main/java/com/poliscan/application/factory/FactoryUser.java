package com.poliscan.application.factory;

import com.poliscan.application.handler.command.CommandUser;
import com.poliscan.domain.model.entity.User;
import org.springframework.stereotype.Component;

@Component
public class FactoryUser {

    public User createUser( CommandUser commandUser){
        return new User(commandUser.getName(), commandUser.getLastName(), commandUser.getEmail(), commandUser.getPass());
    }

    public User updateUser(String id, CommandUser commandUser) {
        return new User(id, commandUser.getName(), commandUser.getLastName(), commandUser.getEmail(), commandUser.getPass());
    }

}
