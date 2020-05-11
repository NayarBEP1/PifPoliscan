package com.poliscan.infrastructure.jparepository;

import com.poliscan.infrastructure.entity.EntityQuestion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaQuestionRepository extends MongoRepository<EntityQuestion, String> {
}
