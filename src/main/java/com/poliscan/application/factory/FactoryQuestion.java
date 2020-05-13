package com.poliscan.application.factory;

import com.poliscan.application.handler.command.CommandQuestion;
import com.poliscan.domain.model.entity.Question;
import org.springframework.stereotype.Component;

@Component
public class FactoryQuestion {

    public Question createQuestion(CommandQuestion commandQuestion) {
        return new Question(commandQuestion.getQuestion(), commandQuestion.getAnswer(), commandQuestion.getDescription(), commandQuestion.getArea());
    }

    public Question updateQuestion(String id, CommandQuestion commandQuestion) {
        return new Question(id, commandQuestion.getQuestion(), commandQuestion.getAnswer(), commandQuestion.getDescription(), commandQuestion.getArea());
    }

}
