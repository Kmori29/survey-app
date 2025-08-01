package com.example.survey_app.entity;

public class SurveryAppEntity {
    
    private String name;
    private String answer;

    public SurveryAppEntity(String name, String answer) {
        this.name = name;
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public String getAnswer() {
        return answer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
