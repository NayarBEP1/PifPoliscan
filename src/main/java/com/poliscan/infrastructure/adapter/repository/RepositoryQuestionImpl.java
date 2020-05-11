package com.poliscan.infrastructure.adapter.repository;

import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.model.entity.Question;
import com.poliscan.domain.port.repository.RepositoryQuestion;
import com.poliscan.infrastructure.adapter.repository.mapper.MapperQuestion;
import com.poliscan.infrastructure.entity.EntityQuestion;
import com.poliscan.infrastructure.jparepository.JpaQuestionRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryQuestionImpl implements RepositoryQuestion {

    private JpaQuestionRepository jpaQuestionRepository;
    private MapperQuestion mapperQuestion = new MapperQuestion();

    public RepositoryQuestionImpl(JpaQuestionRepository jpaQuestionRepository) {
        this.jpaQuestionRepository = jpaQuestionRepository;
    }

    @Override
    public DtoQuestion createQuestion(Question question) {
        ObjectId objectId = new ObjectId();
        question.setId(objectId.toString());
        EntityQuestion entityQuestion = this.mapperQuestion.modelToEntity(question);
        EntityQuestion entityQuestionSaved = this.jpaQuestionRepository.save(entityQuestion);
        return this.mapperQuestion.entityToDto(entityQuestionSaved);
    }

    @Override
    public DtoQuestion updateQuestion(Question question) {
        EntityQuestion entityQuestion = this.mapperQuestion.modelToEntity(question);
        EntityQuestion entityQuestionSaved = this.jpaQuestionRepository.save(entityQuestion);
        return this.mapperQuestion.entityToDto(entityQuestionSaved);
    }

    @Override
    public List<DtoQuestion> listQuestion() {
        return this.mapperQuestion.entityListToDtoList(this.jpaQuestionRepository.findAll());
    }

    @Override
    public void deleteQuestion(String id) {
        this.jpaQuestionRepository.deleteById(id);
    }
}
