package com.mysite.spring_study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.spring_study.question.QuestionService;

@SpringBootTest
class SpringStudyApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("페이징 테스트 :[%03d]", i);
			String content = i + "번째 글입니다.";
			this.questionService.create(subject, content);
		}
	}
}