package com.mysite.spring_study.Answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AnswerForm {

    @NotEmpty(message = "답변을 입력하세요.")
    private String content;
}
