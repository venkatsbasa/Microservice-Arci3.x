package com.question.Services;

import com.question.entity.Question;

import java.util.List;

public interface QuestionServ {
    List<Question> getAllQuestion();
    Question addQuestion(Question question);
    Question getById(long id);
    List<Question> getByQuestion(Long quizid);
}
