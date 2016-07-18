package com.huongdanjava.questionsmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huongdanjava.questionsmanagement.dao.QuestionDao;
import com.huongdanjava.questionsmanagement.entity.Category;
import com.huongdanjava.questionsmanagement.entity.Question;
import com.huongdanjava.questionsmanagement.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Override
    public void addQuestion(int categoryId, String description) {
        Question question = new Question();
        question.setDescription(description);

        Category category = new Category();
        category.setId(categoryId);
        question.setCategory(category);

        questionDao.addQuestion(question);
    }

}
