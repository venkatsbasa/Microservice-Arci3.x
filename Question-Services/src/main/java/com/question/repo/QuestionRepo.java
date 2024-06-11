package com.question.repo;

import com.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepo extends JpaRepository<Question, Long> {

    Optional<Question> findByQuestionId(Long questionId);
    List<Question> findByQuizId(Long quizId);
}
