package com.example.basic.Spring_240701.Quiz;

import lombok.AllArgsConstructor;

public class QuizController {
    private Quiz quiz;
    private QuizView quizView;

    public QuizController(Quiz quiz, QuizView quizView) {
        this.quiz = quiz;
        this.quizView = quizView;
    }
}
