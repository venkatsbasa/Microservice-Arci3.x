package com.quiz.repo;

import com.quiz.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface QuizRepo extends JpaRepository<Quiz,Long>{
    Optional<Quiz> findByqId(Long qId);
}
