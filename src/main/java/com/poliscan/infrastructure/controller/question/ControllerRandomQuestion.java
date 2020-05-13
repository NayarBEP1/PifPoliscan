package com.poliscan.infrastructure.controller.question;

import com.poliscan.application.handler.question.HandlerListQuestion;
import com.poliscan.domain.model.dto.DtoQuestion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class ControllerRandomQuestion {

    private HandlerListQuestion handlerListQuestion;

    public ControllerRandomQuestion(HandlerListQuestion handlerListQuestion) {
        this.handlerListQuestion = handlerListQuestion;
    }

    @GetMapping("/{area}")
    public DtoQuestion getRandomQuestion(@PathVariable String area){
        return this.handlerListQuestion.getRandomQuestion(area);
    }
}
