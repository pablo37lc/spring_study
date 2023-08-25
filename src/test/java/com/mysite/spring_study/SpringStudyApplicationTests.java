package com.mysite.spring_study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.spring_study.Answer.AnswerRepository;
import com.mysite.spring_study.Question.QuestionRepository;

@SpringBootTest
class SpringStudyApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Test
	void testJpa() {

	}
}