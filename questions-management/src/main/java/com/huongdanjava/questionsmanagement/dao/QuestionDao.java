package com.huongdanjava.questionsmanagement.dao;

import com.huongdanjava.questionsmanagement.entity.Question;

public interface QuestionDao {

    /**
     * Add a question into question table.
     *
     * @param question
     *            Question data object.
     */
    void addQuestion(Question question);
}
