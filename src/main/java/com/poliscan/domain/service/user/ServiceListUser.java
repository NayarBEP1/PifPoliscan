package com.poliscan.domain.service.user;

import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.port.repository.RepositoryUser;

import java.util.List;

public class ServiceListUser {

    private RepositoryUser repositoryUser;

    public ServiceListUser(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public List<DtoUser> run(){
        return this.repositoryUser.listUser();
    }
}
