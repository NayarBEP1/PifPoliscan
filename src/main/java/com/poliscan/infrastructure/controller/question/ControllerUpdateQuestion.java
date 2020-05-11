package com.poliscan.infrastructure.controller.question;

import com.poliscan.application.handler.command.CommandQuestion;
import com.poliscan.application.handler.question.HandlerUpdateQuestion;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/question")
public class ControllerUpdateQuestion {

    private HandlerUpdateQuestion handlerUpdateQuestion;

    public ControllerUpdateQuestion(HandlerUpdateQuestion handlerUpdateQuestion) {
        this.handlerUpdateQuestion = handlerUpdateQuestion;
    }

    @PutMapping("/{id}")
    public void updateQuestion(@PathVariable String id, @RequestBody CommandQuestion commandQuestion){
        this.handlerUpdateQuestion.run(id, commandQuestion);
    }
}
