package com.poliscan.infrastructure.controller.user;

import com.poliscan.application.handler.user.HandlerListUser;
import com.poliscan.domain.model.dto.DtoUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class ControllerListUser {

    private HandlerListUser handlerListUser;

    public ControllerListUser(HandlerListUser handlerListUser) {
        this.handlerListUser = handlerListUser;
    }

    @GetMapping
    public List<DtoUser> listUsers(){
        return this.handlerListUser.run();
    }
}
