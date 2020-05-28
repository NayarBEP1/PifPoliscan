package com.poliscan.infrastructure.adapter.repository;

import com.poliscan.domain.exceptions.ExceptionGeneral;
import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.model.entity.Question;
import com.poliscan.domain.port.repository.RepositoryQuestion;
import com.poliscan.infrastructure.adapter.repository.mapper.MapperQuestion;
import com.poliscan.infrastructure.entity.EntityArea;
import com.poliscan.infrastructure.entity.EntityQuestion;
import com.poliscan.infrastructure.jparepository.JpaAreaRepository;
import com.poliscan.infrastructure.jparepository.JpaQuestionRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryQuestionImpl implements RepositoryQuestion {

    private JpaQuestionRepository jpaQuestionRepository;
    private JpaAreaRepository jpaAreaRepository;
    private MapperQuestion mapperQuestion = new MapperQuestion();

    public RepositoryQuestionImpl(JpaQuestionRepository jpaQuestionRepository, JpaAreaRepository jpaAreaRepository) {
        this.jpaQuestionRepository = jpaQuestionRepository;
        this.jpaAreaRepository = jpaAreaRepository;
    }

    @Override
    public DtoQuestion createQuestion(Question question) {
        ObjectId objectId = new ObjectId();
        question.setId(objectId.toString());
        String areaId = question.getArea();
        if(!this.jpaAreaRepository.findById(areaId).isPresent()){
            throw new ExceptionGeneral("Error: El área no existe");
        }
        EntityQuestion entityQuestion = this.mapperQuestion.modelToEntity(question);
        EntityQuestion entityQuestionSaved = this.jpaQuestionRepository.save(entityQuestion);
        return this.mapperQuestion.entityToDto(entityQuestionSaved);
    }

    @Override
    public DtoQuestion updateQuestion(Question question) {
        EntityQuestion entityQuestion = this.mapperQuestion.modelToEntity(question);
        EntityQuestion entityQuestionSaved = this.jpaQuestionRepository.save(entityQuestion);
        String areaId = question.getArea();
        Optional<EntityArea> entityArea = this.jpaAreaRepository.findById(areaId);
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

    @Override
    public List<DtoQuestion> getAQuestion(String area) {
        List<EntityQuestion> entityQuestionList = this.jpaQuestionRepository.findByArea(new ObjectId(area));
        return this.mapperQuestion.entityListToDtoList(entityQuestionList);
    }
}
