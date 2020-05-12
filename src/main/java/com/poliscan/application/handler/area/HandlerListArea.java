package com.poliscan.application.handler.area;

import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.service.area.ServiceListArea;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HandlerListArea {

    private ServiceListArea serviceListArea;

    public HandlerListArea(ServiceListArea serviceListArea) {
        this.serviceListArea = serviceListArea;
    }

    public List<DtoArea> run() { return this.serviceListArea.run(); }
}
