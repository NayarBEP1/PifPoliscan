package com.poliscan.infrastructure.controller.area;

import com.poliscan.application.handler.area.HandlerListArea;
import com.poliscan.domain.model.dto.DtoArea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/area")
public class ControllerListArea {

    private HandlerListArea handlerListArea;

    public ControllerListArea(HandlerListArea handlerListArea) {
        this.handlerListArea = handlerListArea;
    }

    @GetMapping
    public List<DtoArea> listArea() {
        return this.handlerListArea.run();
    }
}
