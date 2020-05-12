package com.poliscan.infrastructure.adapter.repository.mapper;

import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.model.entity.Area;
import com.poliscan.infrastructure.entity.EntityArea;

import java.util.List;
import java.util.stream.Collectors;

public class MapperArea {

    public MapperArea() { }

    public EntityArea modelToEntity(Area area) {
        return new EntityArea(area.getId(), area.getName(), area.getDescription());
    }

    public DtoArea entityToDto(EntityArea entityArea) {
        return new DtoArea(entityArea.getId(), entityArea.getName(), entityArea.getDescription());
    }

    public List<DtoArea> entityToDtoList(List<EntityArea> entityAreaList) {
        return entityAreaList.stream().map(MapperArea::valueOfModel).collect(Collectors.toList());
    }

    private static DtoArea valueOfModel(EntityArea entityArea){
        return new DtoArea(entityArea.getId(), entityArea.getName(), entityArea.getDescription());
    }
}
