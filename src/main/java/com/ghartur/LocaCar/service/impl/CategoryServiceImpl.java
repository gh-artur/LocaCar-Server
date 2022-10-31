package com.ghartur.LocaCar.service.impl;

import com.ghartur.LocaCar.model.Category;
import com.ghartur.LocaCar.repository.CategoryRepository;
import com.ghartur.LocaCar.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoryServiceImpl implements CategoryService {

    final
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Category saveCategory(Category category) {
       return categoryRepository.save(category);
    } //done

    @Override
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Category not found! Id: " + id));
    } //done

    @Override
    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    } //done

    @Override
    public void updateCategory(Category category) {
        Category cat = categoryRepository.findById(category.getId())
                .orElseThrow(() -> new NoSuchElementException("Category not found! Id: " + category.getId()));
        cat.setName(category.getName());
        cat.setDescription(category.getDescription());
        categoryRepository.save(cat);
    }
    @Override
    public void deleteCategoryById(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Category not found! Id: " + id));
        categoryRepository.delete(category);
    }

    @Override
    public boolean existsByName(Category category) {
        return categoryRepository.existsByName(category.getName());
    }


}
