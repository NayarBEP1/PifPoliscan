package com.poliscan.application.handler.user;

import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.service.user.ServiceListUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HandlerListUser {

    private ServiceListUser serviceListUser;

    public HandlerListUser(ServiceListUser serviceListUser) {
        this.serviceListUser = serviceListUser;
    }

    public List<DtoUser> run(){
        return this.serviceListUser.run();
    }

    public DtoUser login(String email, String pass) {
        return this.serviceListUser.login(email, pass);
    }

}
