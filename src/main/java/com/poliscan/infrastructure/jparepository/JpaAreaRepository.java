package com.poliscan.infrastructure.jparepository;

import com.poliscan.infrastructure.entity.EntityArea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JpaAreaRepository extends MongoRepository<EntityArea, String> {
}
