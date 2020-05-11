package com.poliscan.domain.service.user;

import com.poliscan.domain.port.repository.RepositoryUser;

public class ServiceDeleteUser {

    private RepositoryUser repositoryUser;

    public ServiceDeleteUser(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public void run(String id) {
        this.repositoryUser.deleteUser(id);
    }
}
