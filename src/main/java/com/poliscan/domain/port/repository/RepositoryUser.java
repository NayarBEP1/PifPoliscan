package com.poliscan.domain.port.repository;

import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.model.entity.User;

import java.util.List;

public interface RepositoryUser {

    DtoUser createUser(User user);

    DtoUser updateUser(User user);

    List<DtoUser> listUser();

    void deleteUser(String id);
}
