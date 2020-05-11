package com.poliscan.domain.service.user;

import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.model.entity.User;
import com.poliscan.domain.port.repository.RepositoryUser;

public class ServiceCreateUser {

    private RepositoryUser repositoryUser;

    public ServiceCreateUser(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public DtoUser run(User user) {
        return this.repositoryUser.createUser(user);
    }

}
