package com.poliscan.application.handler.user;

import com.poliscan.application.factory.FactoryUser;
import com.poliscan.application.handler.command.CommandUser;
import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.service.user.ServiceCreateUser;
import org.springframework.stereotype.Component;

@Component
public class HandlerCreateUser {

    private final ServiceCreateUser serviceCreateUser;
    private final FactoryUser factoryUser;

    public HandlerCreateUser(ServiceCreateUser serviceCreateUser, FactoryUser factoryUser) {
        this.serviceCreateUser = serviceCreateUser;
        this.factoryUser = factoryUser;
    }

    public DtoUser run(CommandUser commandUser){
        return this.serviceCreateUser.run(this.factoryUser.createUser(commandUser));
    }
}
