package com.poliscan.application.factory;

import com.poliscan.application.handler.command.CommandArea;
import com.poliscan.domain.model.entity.Area;
import org.springframework.stereotype.Component;

@Component
public class FactoryArea {

    public Area createArea( CommandArea commandArea) {
        return new Area(commandArea.getName(), commandArea.getDescription());
    }

    public Area updateArea(String id, CommandArea commandArea ) {
        return new Area(id, commandArea.getName(), commandArea.getDescription());
    }
}
