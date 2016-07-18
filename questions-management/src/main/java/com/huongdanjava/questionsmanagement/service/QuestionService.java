package com.huongdanjava.questionsmanagement.service;

public interface QuestionService {

    /**
     * Add a question with category id and description.
     *
     * @param categoryId
     *            Category Id of the question.
     * @param description
     *            Description of the question.
     */
    void addQuestion(int categoryId, String description);
}
