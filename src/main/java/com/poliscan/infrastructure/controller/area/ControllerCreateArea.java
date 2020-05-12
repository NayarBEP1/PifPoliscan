package com.poliscan.infrastructure.controller.area;

import com.poliscan.application.handler.area.HandlerCreateArea;
import com.poliscan.application.handler.command.CommandArea;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/area")
public class ControllerCreateArea {

    private HandlerCreateArea handlerCreateArea;

    public ControllerCreateArea(HandlerCreateArea handlerCreateArea) {
        this.handlerCreateArea = handlerCreateArea;
    }

    @PostMapping
    public void run(@RequestBody CommandArea commandArea) {
        this.handlerCreateArea.run(commandArea);
    }
}
