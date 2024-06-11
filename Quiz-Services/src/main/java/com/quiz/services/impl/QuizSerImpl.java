package com.quiz.services.impl;

import com.quiz.entity.Quiz;
import com.quiz.repo.QuizRepo;
import com.quiz.services.QuestionClient;
import com.quiz.services.QuizServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class QuizSerImpl implements QuizServices {
    private QuizRepo repo;
    private QuestionClient srv;
    public QuizSerImpl(QuizRepo repo, QuestionClient srv) {
        this.repo = repo;
        this.srv = srv;
    }



    @Override
    public Quiz addQuiz(Quiz quiz) {
         return repo.save(quiz);
    }

    @Override
    public Quiz getQuizById(Long id) {
        Quiz quiz = repo.findByqId(id).orElseThrow(() -> new RuntimeException("Quiz id not found"));
        quiz.setQuestion(srv.getQuestion(quiz.getQId()));
        return quiz;
    }

    @Override
    public List<Quiz> getAllQuiz() {
        List<Quiz> quiz= repo.findAll();
        List<Quiz> listStream = quiz.stream().map(q -> {
            q.setQuestion(srv.getQuestion(q.getQId()));
            return q;
        }).collect(Collectors.toList());
      return listStream;
    }
}
