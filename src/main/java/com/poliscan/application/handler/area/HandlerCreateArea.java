package com.poliscan.application.handler.area;

import com.poliscan.application.factory.FactoryArea;
import com.poliscan.application.handler.command.CommandArea;
import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.service.area.ServiceCreateArea;
import org.springframework.stereotype.Component;

@Component
public class HandlerCreateArea {

    private final ServiceCreateArea serviceCreateArea;
    private final FactoryArea factoryArea;

    public HandlerCreateArea(ServiceCreateArea serviceCreateArea, FactoryArea factoryArea) {
        this.serviceCreateArea = serviceCreateArea;
        this.factoryArea = factoryArea;
    }

    public DtoArea run(CommandArea commandArea) {
        return this.serviceCreateArea.run(this.factoryArea.createArea(commandArea));
    }
}
