package com.mysite.spring_study.Answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.spring_study.Question.Question;
import com.mysite.spring_study.Question.QuestionService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerServiece answerServiece;

    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content) {
        Question question = this.questionService.getQuestion(id);
        this.answerServiece.create(question, content);
        return String.format("redirect:/question/detail/%s", id);
    }

}
