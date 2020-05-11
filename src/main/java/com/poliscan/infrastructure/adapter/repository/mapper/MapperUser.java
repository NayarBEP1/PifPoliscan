package com.poliscan.infrastructure.adapter.repository.mapper;

import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.model.entity.User;
import com.poliscan.infrastructure.entity.EntityUser;

import java.util.List;
import java.util.stream.Collectors;

public class MapperUser {

    public MapperUser(){}

    public EntityUser modelToEntity(User user) {
        return new EntityUser(user.getId(),user.getName(), user.getLastName(), user.getEmail(), user.getPass());
    }

    public DtoUser entityToDto(EntityUser entityUser) {
        return new DtoUser(entityUser.getId(), entityUser.getName(), entityUser.getLastName(), entityUser.getEmail());
    }

    public List<DtoUser> entityListToDtoList(List<EntityUser> entityUserList){
        return entityUserList.stream().map(MapperUser::valueOfModel).collect(Collectors.toList());
    }

    private static DtoUser valueOfModel(EntityUser entityUser){
        return new DtoUser(entityUser.getId(), entityUser.getName(), entityUser.getLastName(), entityUser.getEmail());
    }
}
