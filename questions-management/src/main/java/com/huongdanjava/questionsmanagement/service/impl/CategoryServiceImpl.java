package com.huongdanjava.questionsmanagement.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huongdanjava.questionsmanagement.dao.CategoryDao;
import com.huongdanjava.questionsmanagement.entity.Category;
import com.huongdanjava.questionsmanagement.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Map<Integer, String>> findAllCategories() {
        List<Map<Integer, String>> categories = new ArrayList<Map<Integer, String>>();

        List<Category> categoriesFromDatabase = categoryDao.findAll();
        for (Category c : categoriesFromDatabase) {
            Map<Integer, String> map = new HashMap<>();
            map.put(c.getId(), c.getName());

            categories.add(map);
        }

        return categories;
    }

}
