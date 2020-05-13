package com.poliscan.infrastructure.controller.user;

import com.poliscan.application.handler.command.CommandUser;
import com.poliscan.application.handler.user.HandlerListUser;
import com.poliscan.domain.model.dto.DtoUser;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class ControllerLogInUser {

    private HandlerListUser handlerListUser;

    public ControllerLogInUser(HandlerListUser handlerListUser) {
        this.handlerListUser = handlerListUser;
    }

    @PostMapping("/login")
    public DtoUser login(@RequestBody CommandUser commandUser) {
        return this.handlerListUser.login(commandUser.getEmail(), commandUser.getPass());
    }
}
