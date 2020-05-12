package com.poliscan.application.handler.question;

import com.poliscan.application.factory.FactoryQuestion;
import com.poliscan.application.handler.command.CommandQuestion;
import com.poliscan.domain.model.dto.DtoQuestion;
import com.poliscan.domain.service.question.ServiceCreateQuestion;
import org.springframework.stereotype.Component;

@Component
public class HandlerCreateQuestion {

    private final ServiceCreateQuestion serviceCreateQuestion;
    private final FactoryQuestion factoryQuestion;

    public HandlerCreateQuestion(ServiceCreateQuestion serviceCreateQuestion, FactoryQuestion factoryQuestion) {
        this.serviceCreateQuestion = serviceCreateQuestion;
        this.factoryQuestion = factoryQuestion;
    }

    public DtoQuestion run(CommandQuestion commandQuestion) {
        return this.serviceCreateQuestion.run(this.factoryQuestion.createQuestion(commandQuestion));
    }
}
