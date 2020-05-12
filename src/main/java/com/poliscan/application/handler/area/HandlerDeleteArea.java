package com.poliscan.application.handler.area;

import com.poliscan.domain.service.area.ServiceDeleteArea;
import org.springframework.stereotype.Component;

@Component
public class HandlerDeleteArea {

    private final ServiceDeleteArea serviceDeleteArea;

    public HandlerDeleteArea(ServiceDeleteArea serviceDeleteArea) {
        this.serviceDeleteArea = serviceDeleteArea;
    }

    public void run(String id) { this.serviceDeleteArea.run(id); }
}
