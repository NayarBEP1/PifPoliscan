package com.poliscan.infrastructure.controller.question;

import com.poliscan.application.handler.command.CommandQuestion;
import com.poliscan.application.handler.question.HandlerCreateQuestion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class ControllerCreateQuestion {

    private HandlerCreateQuestion handlerCreateQuestion;

    public ControllerCreateQuestion(HandlerCreateQuestion handlerCreateQuestion) {
        this.handlerCreateQuestion = handlerCreateQuestion;
    }

    @PostMapping
    public void run(@RequestBody CommandQuestion commandQuestion) {
        this.handlerCreateQuestion.run(commandQuestion);
    }
}
