package com.poliscan.application.handler.area;

import com.poliscan.application.factory.FactoryArea;
import com.poliscan.application.handler.command.CommandArea;
import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.service.area.ServiceUpdateArea;
import org.springframework.stereotype.Component;

@Component
public class HandlerUpdateArea {

    private final ServiceUpdateArea serviceUpdateArea;
    private final FactoryArea factoryArea;

    public HandlerUpdateArea(ServiceUpdateArea serviceUpdateArea, FactoryArea factoryArea) {
        this.serviceUpdateArea = serviceUpdateArea;
        this.factoryArea = factoryArea;
    }

    public DtoArea run(String id, CommandArea commandArea) {
        return this.serviceUpdateArea.run(this.factoryArea.updateArea(id, commandArea));
    }
}
