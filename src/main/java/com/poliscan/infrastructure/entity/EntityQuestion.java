package com.poliscan.infrastructure.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("pregunta")
public class EntityQuestion {

    @MongoId
    private String id;
    private String question;
    private String answer;
    private String description;
    private String area;

    public EntityQuestion(String id, String question, String answer, String description, String area) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.description = description;
        this.area = area;
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

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
