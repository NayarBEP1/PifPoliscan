package com.poliscan.domain.service.question;

import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.model.entity.Question;
import com.poliscan.domain.port.repository.RepositoryQuestion;

public class ServiceUpdateQuestion {

    private RepositoryQuestion repositoryQuestion;

    public ServiceUpdateQuestion(RepositoryQuestion repositoryQuestion) {
        this.repositoryQuestion = repositoryQuestion;
    }

    public DtoQuestion run(Question question){
        return this.repositoryQuestion.updateQuestion(question);
    }
}
