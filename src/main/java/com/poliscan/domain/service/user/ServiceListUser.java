package com.poliscan.domain.service.user;

import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.port.repository.RepositoryUser;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public class ServiceListUser {

    private RepositoryUser repositoryUser;

    public ServiceListUser(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public List<DtoUser> run(){
        return this.repositoryUser.listUser();
    }

    public DtoUser login(String email, String pass) { return this.repositoryUser.login(email, pass); }
}
