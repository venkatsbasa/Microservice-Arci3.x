package com.question.controller;

import com.question.Services.QuestionServ;
import com.question.entity.Question;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private QuestionServ serv;

    public QuestionController(QuestionServ serv) {
        this.serv = serv;
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        return serv.addQuestion(question);
    }
    @GetMapping
    public List<Question> getAllQuestions() {
        return serv.getAllQuestion();
    }
    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable Long id) {
        return serv.getById(id);
    }
    @GetMapping("/quiz/{quzid}")
    public List<Question> getQuestionByquizId(@PathVariable("quzid") Long id) {
        return serv.getByQuestion(id);
    }
}
