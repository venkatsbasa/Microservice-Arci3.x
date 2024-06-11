package com.quiz.controller;

import com.quiz.entity.Quiz;
import org.springframework.web.bind.annotation.*;
import com.quiz.services.QuizServices;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizServices quizService;

    public QuizController(QuizServices quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return quizService.addQuiz(quiz);
    }
    @GetMapping("/{id}")
    public  Quiz getQuiz(@PathVariable("id") Long id) {
        return quizService.getQuizById(id);
    }
    @GetMapping
    public List<Quiz> getAllQuiz() {
        return quizService.getAllQuiz();
    }
}
