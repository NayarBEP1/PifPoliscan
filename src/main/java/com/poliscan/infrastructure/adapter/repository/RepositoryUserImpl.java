package com.poliscan.infrastructure.adapter.repository;

import com.poliscan.domain.model.dto.DtoUser;
import com.poliscan.domain.model.entity.User;
import com.poliscan.domain.port.repository.RepositoryUser;
import com.poliscan.infrastructure.adapter.repository.mapper.MapperUser;
import com.poliscan.infrastructure.entity.EntityUser;
import com.poliscan.infrastructure.jparepository.JpaUserRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryUserImpl implements RepositoryUser {

    private JpaUserRepository jpaUserRepository;
    private MapperUser mapperUser = new MapperUser();

    public RepositoryUserImpl(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public DtoUser createUser(User user) {
        ObjectId objectId = new ObjectId();
        user.setId(objectId.toString());
        EntityUser entityUser = this.mapperUser.modelToEntity(user);
        EntityUser entityUserSaved = this.jpaUserRepository.save(entityUser);
        return this.mapperUser.entityToDto(entityUserSaved);
    }

    @Override
    public DtoUser updateUser(User user) {
        EntityUser entityUser = this.mapperUser.modelToEntity(user);
        EntityUser userUpdated = this.jpaUserRepository.save(entityUser);
        return this.mapperUser.entityToDto(userUpdated);
    }

    @Override
    public List<DtoUser> listUser() {
        return this.mapperUser.entityListToDtoList(this.jpaUserRepository.findAll());
    }

    @Override
    public void deleteUser(String id) {
        this.jpaUserRepository.deleteById(id);
    }


}
