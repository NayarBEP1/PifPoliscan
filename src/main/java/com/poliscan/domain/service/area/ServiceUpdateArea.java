package com.poliscan.domain.service.area;

import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.model.entity.Area;
import com.poliscan.domain.port.repository.RepositoryArea;

public class ServiceUpdateArea {

    private RepositoryArea repositoryArea;

    public ServiceUpdateArea(RepositoryArea repositoryArea) {
        this.repositoryArea = repositoryArea;
    }

    public DtoArea run(Area area) {
        return this.repositoryArea.updateArea(area);
    }
}
