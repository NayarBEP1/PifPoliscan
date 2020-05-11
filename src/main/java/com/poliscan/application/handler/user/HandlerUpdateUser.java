package com.poliscan.application.handler.user;

import com.poliscan.application.factory.FactoryUser;
import com.poliscan.application.handler.command.CommandUser;
import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.model.entity.User;
import com.poliscan.domain.service.user.ServiceUpdateUser;
import org.springframework.stereotype.Component;

@Component
public class HandlerUpdateUser {

    private final ServiceUpdateUser serviceUpdateUser;
    private final FactoryUser factoryQuestion;

    public HandlerUpdateUser(ServiceUpdateUser serviceUpdateUser, FactoryUser factoryQuestion) {
        this.serviceUpdateUser = serviceUpdateUser;
        this.factoryQuestion = factoryQuestion;
    }

    public DtoUser run(String id, CommandUser commandUser) {
        return this.serviceUpdateUser.run(this.factoryQuestion.updateUser(id, commandUser));
    }
}
