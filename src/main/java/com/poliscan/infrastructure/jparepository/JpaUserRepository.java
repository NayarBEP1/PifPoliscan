package com.poliscan.infrastructure.jparepository;

import com.poliscan.infrastructure.entity.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends MongoRepository<EntityUser, String> {
}
