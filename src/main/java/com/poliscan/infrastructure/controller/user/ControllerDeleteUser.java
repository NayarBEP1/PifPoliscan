package com.poliscan.infrastructure.controller.user;

import com.poliscan.application.handler.user.HandlerDeleteUser;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class ControllerDeleteUser {

    private HandlerDeleteUser handlerDeleteUser;

    public ControllerDeleteUser(HandlerDeleteUser handlerDeleteUser) {
        this.handlerDeleteUser = handlerDeleteUser;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        this.handlerDeleteUser.run(id);
    }
}
