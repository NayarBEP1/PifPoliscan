package com.poliscan.domain.port.repository;

import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.model.entity.Question;

import java.util.List;

public interface RepositoryQuestion {

    DtoQuestion createQuestion(Question question);

    DtoQuestion updateQuestion(Question question);

    List<DtoQuestion> listQuestion();

    void deleteQuestion(String id);

    List<DtoQuestion> getAQuestion(String area);

}
