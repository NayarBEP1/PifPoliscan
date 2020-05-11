package com.poliscan.infrastructure.controller.question;

import com.poliscan.application.handler.question.HandlerDeleteQuestion;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class ControllerDeleteQuestion {

    private HandlerDeleteQuestion handlerDeleteQuestion;

    public ControllerDeleteQuestion(HandlerDeleteQuestion handlerDeleteQuestion) {
        this.handlerDeleteQuestion = handlerDeleteQuestion;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        this.handlerDeleteQuestion.run(id);
    }
}
