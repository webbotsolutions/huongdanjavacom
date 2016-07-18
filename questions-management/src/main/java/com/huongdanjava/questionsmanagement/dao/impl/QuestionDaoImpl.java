package com.huongdanjava.questionsmanagement.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huongdanjava.questionsmanagement.dao.QuestionDao;
import com.huongdanjava.questionsmanagement.entity.Question;

@Repository
@Transactional
public class QuestionDaoImpl implements QuestionDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addQuestion(Question question) {
        em.persist(question);
    }

}
