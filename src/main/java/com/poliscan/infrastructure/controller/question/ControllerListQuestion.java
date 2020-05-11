package com.poliscan.infrastructure.controller.question;

import com.poliscan.application.handler.question.HandlerListQuestion;
import com.poliscan.domain.model.dto.DtoQuestion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class ControllerListQuestion {

    private HandlerListQuestion handlerListQuestion;

    public ControllerListQuestion(HandlerListQuestion handlerListQuestion) {
        this.handlerListQuestion = handlerListQuestion;
    }

    @GetMapping
    public List<DtoQuestion> listQuestion() {
        return this.handlerListQuestion.run();
    }
}
