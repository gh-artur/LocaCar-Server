package com.ghartur.LocaCar.service;

import com.ghartur.LocaCar.model.Category;

import java.util.List;


public interface CategoryService {

    Category saveCategory(Category Category);
    Category findCategoryById(Long id);
    List<Category> findAllCategories();
    void updateCategory(Category Category);
    void deleteCategoryById(Long id);
    boolean existsByName(Category category);

}
