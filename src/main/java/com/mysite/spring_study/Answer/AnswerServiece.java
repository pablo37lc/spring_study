package com.mysite.spring_study.answer;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.mysite.spring_study.question.Question;
import com.mysite.spring_study.user.SiteUser;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerServiece {

    public final AnswerRepository answerRepository;

    public Answer create(Question question, String content, SiteUser author) {
        Answer answer = new Answer();

        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        answer.setAuthor(author);
        this.answerRepository.save(answer);

        return answer;
    }
}
