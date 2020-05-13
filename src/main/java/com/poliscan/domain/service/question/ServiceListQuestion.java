package com.poliscan.domain.service.question;

import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.port.repository.RepositoryQuestion;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ServiceListQuestion {

    private RepositoryQuestion repositoryQuestion;

    public ServiceListQuestion(RepositoryQuestion repositoryQuestion) {
        this.repositoryQuestion = repositoryQuestion;
    }

    public List<DtoQuestion> run(){
        return this.repositoryQuestion.listQuestion();
    }

    public DtoQuestion getRandomQuestion(String area) {
        List<DtoQuestion> list = this.repositoryQuestion.getAQuestion(area);
        int random = ThreadLocalRandom.current().nextInt(0,list.size());
        return list.get(random);
    }
}
