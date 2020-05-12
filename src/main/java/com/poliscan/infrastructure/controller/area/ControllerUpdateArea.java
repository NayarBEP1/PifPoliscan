package com.poliscan.infrastructure.controller.area;

import com.poliscan.application.handler.area.HandlerUpdateArea;
import com.poliscan.application.handler.command.CommandArea;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/area")
public class ControllerUpdateArea {

    private HandlerUpdateArea handlerUpdateArea;

    public ControllerUpdateArea(HandlerUpdateArea handlerUpdateArea) {
        this.handlerUpdateArea = handlerUpdateArea;
    }

    @PutMapping("/{id}")
    public void updateArea(@PathVariable String id, @RequestBody CommandArea commandArea){
        this.handlerUpdateArea.run(id, commandArea);
    }
}
