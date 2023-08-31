package com.mysite.spring_study.answer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    @Query("select "
            + "distinct a "
            + "from Answer a "
            + "     left outer join Question q on a.question=q "
            + "where "
            + "      q.id = :id ")
    Page<Answer> findAllByQuestionID(@Param("id") Integer id, Pageable pageable);

}
