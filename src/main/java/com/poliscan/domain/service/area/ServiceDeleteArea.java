package com.poliscan.domain.service.area;

import com.poliscan.domain.port.repository.RepositoryArea;

public class ServiceDeleteArea {

    private RepositoryArea repositoryArea;

    public ServiceDeleteArea(RepositoryArea repositoryArea) {
        this.repositoryArea = repositoryArea;
    }

    public void run(String id) { this.repositoryArea.deleteArea(id); }
}
