package com.poliscan.domain.service.question;

import com.poliscan.domain.port.repository.RepositoryQuestion;

public class ServiceDeleteQuestion {

    private RepositoryQuestion repositoryQuestion;

    public ServiceDeleteQuestion(RepositoryQuestion repositoryQuestion) {
        this.repositoryQuestion = repositoryQuestion;
    }

    public void run(String id) { this.repositoryQuestion.deleteQuestion(id); }
}
