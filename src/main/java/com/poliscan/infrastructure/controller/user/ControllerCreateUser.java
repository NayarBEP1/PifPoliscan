package com.poliscan.infrastructure.controller.user;

import com.poliscan.application.handler.command.CommandUser;
import com.poliscan.application.handler.user.HandlerCreateUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class ControllerCreateUser {

    private HandlerCreateUser handlerCreateUser;

    public ControllerCreateUser(HandlerCreateUser handlerCreateUser) {
        this.handlerCreateUser = handlerCreateUser;
    }

    @PostMapping
    public void run(@RequestBody CommandUser commandUser){
        this.handlerCreateUser.run(commandUser);
    }
}
