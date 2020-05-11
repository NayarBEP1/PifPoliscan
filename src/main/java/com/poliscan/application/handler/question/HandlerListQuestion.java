package com.poliscan.application.handler.question;

import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.service.question.ServiceListQuestion;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HandlerListQuestion {

    private ServiceListQuestion serviceListQuestion;

    public HandlerListQuestion(ServiceListQuestion serviceListQuestion) {
        this.serviceListQuestion = serviceListQuestion;
    }

    public List<DtoQuestion> run(){
         return this.serviceListQuestion.run();
    }

    public DtoQuestion getRandomQuestion(){
        return this.serviceListQuestion.getRandomQuestion();
    }
}
