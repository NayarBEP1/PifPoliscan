package com.poliscan.infrastructure.adapter.repository.mapper;

import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.model.entity.Question;
import com.poliscan.infrastructure.entity.EntityQuestion;

import java.util.List;
import java.util.stream.Collectors;

public class MapperQuestion {

    public MapperQuestion() { }

    public EntityQuestion modelToEntity(Question question) {
        return new EntityQuestion(question.getId(), question.getQuestion(), question.getAnswer(), question.getDescription());
    }

    public DtoQuestion entityToDto(EntityQuestion entityQuestion) {
        return new DtoQuestion(entityQuestion.getId(), entityQuestion.getQuestion(), entityQuestion.getAnswer(), entityQuestion.getDescription());
    }


    public List<DtoQuestion> entityListToDtoList(List<EntityQuestion> entityQuestionList){
        return entityQuestionList.stream().map(MapperQuestion::valueOfModel).collect(Collectors.toList());
    }

    private static DtoQuestion valueOfModel(EntityQuestion entityQuestion){
        return new DtoQuestion(entityQuestion.getId(), entityQuestion.getQuestion(), entityQuestion.getAnswer(), entityQuestion.getDescription());
    }
}
