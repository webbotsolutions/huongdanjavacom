package com.huongdanjava.questionsmanagement.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huongdanjava.questionsmanagement.dao.CategoryDao;
import com.huongdanjava.questionsmanagement.entity.Category;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Category> findAll() {
        return em.createQuery("SELECT c FROM Category c", Category.class).getResultList();
    }

}
