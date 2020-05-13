package com.poliscan.infrastructure.jparepository;

import com.poliscan.infrastructure.entity.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaUserRepository extends MongoRepository<EntityUser, String> {

    Optional<EntityUser> findByEmailAndPass(String email, String pass);

    Boolean existsByEmail(String email);
}
