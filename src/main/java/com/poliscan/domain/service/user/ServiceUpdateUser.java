package com.poliscan.domain.service.user;

import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.model.entity.User;
import com.poliscan.domain.port.repository.RepositoryUser;

public class ServiceUpdateUser {

    private RepositoryUser repository;

    public ServiceUpdateUser(RepositoryUser repository) {
        this.repository = repository;
    }

    public DtoUser run(User user) {
        return this.repository.updateUser(user);
    }
}
