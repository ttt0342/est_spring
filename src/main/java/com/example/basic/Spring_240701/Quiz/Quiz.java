package com.example.basic.Spring_240701.Quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



public class Quiz {
    private String question;
    private String answer;

    public Quiz(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}