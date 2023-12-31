package com.mysite.spring_study.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    Question findBySubject(String subject);

    Question findBySubjectAndContent(String subject, String content);

    List<Question> findBySubjectLike(String subject);

    Page<Question> findAll(Pageable pageable);

    @Query("select "
            + "distinct q "
            + "from Question q "
            + "     left outer join SiteUser uq on q.author=uq "
            + "     left outer join Answer a on a.question=q "
            + "     left outer join SiteUser ua on a.author=ua "
            + "where "
            + "      q.subject like %:keyword% "
            + "   or q.content like %:keyword% "
            + "   or uq.username like %:keyword% "
            + "   or a.content like %:keyword% "
            + "   or ua.username like %:keyword% ")
    Page<Question> findAllByKeyword(@Param("keyword") String keyword, Pageable pageable);

}
