package com.poliscan.domain.service.question;

import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.model.entity.Question;
import com.poliscan.domain.port.repository.RepositoryQuestion;

public class ServiceCreateQuestion {

    private RepositoryQuestion repositoryQuestion;

    public ServiceCreateQuestion(RepositoryQuestion repositoryQuestion) {
        this.repositoryQuestion = repositoryQuestion;
    }

    public DtoQuestion run(Question question) { return this.repositoryQuestion.createQuestion(question); }

}
