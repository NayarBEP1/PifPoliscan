package com.poliscan.application.handler.command;

public class CommandQuestion {

    private String question;
    private String answer;
    private String description;

    public CommandQuestion(String question, String answer, String description) {
        this.question = question;
        this.answer = answer;
        this.description = description;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getDescription() {
        return description;
    }
}
