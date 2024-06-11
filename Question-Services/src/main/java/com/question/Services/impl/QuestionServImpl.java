package com.question.Services.impl;

import com.question.Services.QuestionServ;
import com.question.entity.Question;
import com.question.repo.QuestionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServImpl implements QuestionServ {

    private QuestionRepo repo;

    public QuestionServImpl(QuestionRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Question> getAllQuestion() {
        return repo.findAll();
    }

    @Override
    public Question addQuestion(Question question) {
        return repo.save(question);
    }

    @Override
    public Question getById(long id) {
        return repo.findByQuestionId(id).orElseThrow(()->new RuntimeException("Question id not found"));
    }

    @Override
    public List<Question> getByQuestion(Long quizid) {
        return repo.findByQuizId(quizid);
    }
}
