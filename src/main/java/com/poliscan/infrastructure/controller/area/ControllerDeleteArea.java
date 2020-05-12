package com.poliscan.infrastructure.controller.area;

import com.poliscan.application.handler.area.HandlerDeleteArea;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/area")
public class ControllerDeleteArea {

    private HandlerDeleteArea handlerDeleteArea;

    public ControllerDeleteArea(HandlerDeleteArea handlerDeleteArea) {
        this.handlerDeleteArea = handlerDeleteArea;
    }

    @DeleteMapping("/{id}")
    public void deleteArea(@PathVariable String id){
        this.handlerDeleteArea.run(id);
    }
}
