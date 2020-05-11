package com.poliscan.application.handler.question;

import com.poliscan.application.factory.FactoryQuestion;
import com.poliscan.application.handler.command.CommandQuestion;
import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.service.question.ServiceUpdateQuestion;
import org.springframework.stereotype.Component;

@Component
public class HandlerUpdateQuestion {

    private final ServiceUpdateQuestion serviceUpdateQuestion;
    private final FactoryQuestion factoryQuestion;

    public HandlerUpdateQuestion(ServiceUpdateQuestion serviceUpdateQuestion, FactoryQuestion factoryQuestion) {
        this.serviceUpdateQuestion = serviceUpdateQuestion;
        this.factoryQuestion = factoryQuestion;
    }

    public DtoQuestion run(String id, CommandQuestion commandQuestion){
        return this.serviceUpdateQuestion.run(this.factoryQuestion.updateQuestion(id, commandQuestion));
    }
}
