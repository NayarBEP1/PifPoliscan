package com.poliscan.domain.service.area;

import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.port.repository.RepositoryArea;

import java.util.List;

public class ServiceListArea {

    private RepositoryArea repositoryArea;

    public ServiceListArea(RepositoryArea repositoryArea) {
        this.repositoryArea = repositoryArea;
    }

    public List<DtoArea> run() {
        return this.repositoryArea.listArea();
    }
}
