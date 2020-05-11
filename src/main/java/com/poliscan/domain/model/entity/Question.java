package com.poliscan.domain.model.entity;

public class Question {

    private String id;
    private String question;
    private String answer;
    private String description;

    public Question(String id, String question, String answer, String description) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.description = description;
    }

    public Question(String question, String answer, String description) {
        this.question = question;
        this.answer = answer;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
