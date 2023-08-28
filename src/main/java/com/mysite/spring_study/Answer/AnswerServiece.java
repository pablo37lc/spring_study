package com.mysite.spring_study.Answer;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.mysite.spring_study.Question.Question;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerServiece {

    public final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}
