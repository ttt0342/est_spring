package com.example.basic.Spring_240701.Quiz;

import java.util.Scanner;

public class QuizView {
    public void DisplayQuestion(Quiz quiz) {
        System.out.println("Question: " + quiz.getQuestion());
    }

    public void getUserAnswer(Quiz quiz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter answer: ");
        String is = scanner.nextLine();
    }

//    public void displayResult(Quiz quiz) {
//        if () {
//        }
//    }
}
