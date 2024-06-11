package com.quiz.services;

import com.quiz.entity.Quiz;

import java.util.List;

public interface QuizServices {
    Quiz addQuiz(Quiz quiz);
    Quiz getQuizById(Long id);
    List<Quiz> getAllQuiz();
}
