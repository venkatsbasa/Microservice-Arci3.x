package com.quiz.services;

import com.quiz.entity.Question;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "QUESTION-SERVICES")
public interface QuestionClient {
    @GetMapping("/questions/quiz/{quzid}")
    List<Question> getQuestion(@PathVariable Long quzid);
}
