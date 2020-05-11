package com.poliscan.application.handler.user;

import com.poliscan.domain.service.user.ServiceDeleteUser;
import org.springframework.stereotype.Component;

@Component
public class HandlerDeleteUser {

    private ServiceDeleteUser serviceDeleteUser;

    public HandlerDeleteUser(ServiceDeleteUser serviceDeleteUser) {
        this.serviceDeleteUser = serviceDeleteUser;
    }

    public void run(String id){
        this.serviceDeleteUser.run(id);
    }
}
