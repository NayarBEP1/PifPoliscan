package com.poliscan.domain.model.entity;

public class Question {

    private String id;
    private String question;
    private String answer;
    private String description;
    private String area;

    private final String QUESTION_IS_MANDATORY = "Error: Question is mandatory";
    private final String ANSWER_IS_MANDATORY = "Error: Answer is mandatory";
    private final String AREA_IS_MANDATORY = "Error: Area is mandatory";

    public Question(String id, String question, String answer, String description, String area) {
        dataValidator(question, answer, area);
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.description = description;
        this.area = area;
    }

    public Question(String question, String answer, String description, String area) {
        dataValidator(question, answer, area);
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

    public String getAnswer() {
        return answer;
    }

    public String getDescription() {
        return description;
    }

    public String getArea() {
        return area;
    }

    private void dataValidator(String question, String answer, String area){
        DataValidator.isMandatory(question, QUESTION_IS_MANDATORY);
        DataValidator.isMandatory(answer, ANSWER_IS_MANDATORY);
        DataValidator.isMandatory(area, AREA_IS_MANDATORY);
    }
}
