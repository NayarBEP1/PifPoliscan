package com.poliscan.application.handler.question;

import com.poliscan.domain.service.question.ServiceDeleteQuestion;
import org.springframework.stereotype.Component;

@Component
public class HandlerDeleteQuestion {

    private ServiceDeleteQuestion serviceDeleteQuestion;

    public HandlerDeleteQuestion(ServiceDeleteQuestion serviceDeleteQuestion) {
        this.serviceDeleteQuestion = serviceDeleteQuestion;
    }

    public void run(String id) {
        this.serviceDeleteQuestion.run(id);
    }
}
