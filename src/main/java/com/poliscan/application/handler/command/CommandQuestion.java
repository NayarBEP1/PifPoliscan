package com.poliscan.application.handler.command;

public class CommandQuestion {

    private String question;
    private String answer;
    private String description;
    private String area;

    public CommandQuestion(String question, String answer, String description, String area) {
        this.question = question;
        this.answer = answer;
        this.description = description;
        this.area = area;
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

    public String getArea() {
        return area;
    }
}
