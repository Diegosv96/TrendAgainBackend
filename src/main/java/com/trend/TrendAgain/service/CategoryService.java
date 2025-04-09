package com.trend.TrendAgain.service;

import com.trend.TrendAgain.model.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    List<Category> getAllCategories();
    Category getCategoryByName(String name);
}
