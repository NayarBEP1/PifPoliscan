package com.poliscan.domain.port.repository;

import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.model.entity.Area;

import java.util.List;

public interface RepositoryArea {

    DtoArea createArea(Area area);

    DtoArea updateArea(Area area);

    List<DtoArea> listArea();

    void deleteArea(String id);
}
