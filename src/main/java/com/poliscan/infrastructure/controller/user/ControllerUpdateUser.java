package com.poliscan.infrastructure.controller.user;


import com.poliscan.application.handler.command.CommandUser;
import com.poliscan.application.handler.user.HandlerUpdateUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class ControllerUpdateUser {

    private HandlerUpdateUser handlerUpdateUser;

    public ControllerUpdateUser(HandlerUpdateUser handlerUpdateUser) {
        this.handlerUpdateUser = handlerUpdateUser;
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody CommandUser commandUser, @PathVariable String id) {
        this.handlerUpdateUser.run(id, commandUser);
    }
}
