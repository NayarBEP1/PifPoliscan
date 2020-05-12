package com.poliscan.domain.service.area;

import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.model.entity.Area;
import com.poliscan.domain.port.repository.RepositoryArea;

public class ServiceCreateArea {

    private RepositoryArea repositoryArea;

    public ServiceCreateArea(RepositoryArea repositoryArea) {
        this.repositoryArea = repositoryArea;
    }

    public DtoArea run(Area area) {
        return this.repositoryArea.createArea(area);
    }
}
