package com.poliscan.infrastructure.jparepository;

import com.poliscan.infrastructure.entity.EntityQuestion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaQuestionRepository extends MongoRepository<EntityQuestion, String> {

    List<EntityQuestion> findByArea(String area);
}
