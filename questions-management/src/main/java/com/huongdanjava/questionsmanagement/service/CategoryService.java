package com.huongdanjava.questionsmanagement.service;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    /**
     * Find all categories include the id of the category with its name.
     *
     * @return List of Map (key is id and value is name) from list of categories.
     */
    List<Map<Integer, String>> findAllCategories();
}
