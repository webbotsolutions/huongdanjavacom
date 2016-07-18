package com.huongdanjava.questionsmanagement.dao;

import java.util.List;

import com.huongdanjava.questionsmanagement.entity.Category;

public interface CategoryDao {

    /**
     * Get all categories from database.
     *
     * @return List of categories.
     */
    List<Category> findAll();
}
