package com.ghartur.LocaCar.controller;

import com.ghartur.LocaCar.dto.CategoryDTO;
import com.ghartur.LocaCar.model.Category;
import com.ghartur.LocaCar.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;

    @Autowired
    public CategoryController(CategoryService categoryService, ModelMapper modelMapper) {
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    //saveCategory
    @PostMapping
    public void saveCategory(@RequestBody CategoryDTO newCategory){
        Category category = modelMapper.map(newCategory,Category.class);
        boolean exists = categoryService.existsByName(category);
        if (exists){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Category already exists");
        } else {
            categoryService.saveCategory(category);
        }
    }
    //findCategoryById
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> findById(@PathVariable Long id){
        Category category = categoryService.findCategoryById(id);
        CategoryDTO categoryResponse = modelMapper.map(category,CategoryDTO.class);
        return ResponseEntity.ok().body(categoryResponse);
    }
    //findAllCategories
    @GetMapping
    public List<CategoryDTO> findAll(){
        return categoryService.findAllCategories().stream()
                .map(category -> modelMapper.map(category,CategoryDTO.class))
                .collect(Collectors.toList());
    }
    //updateCategory
    @PutMapping
    public ResponseEntity<CategoryDTO> updateCategory(@RequestBody CategoryDTO newCategory){
        Category category = modelMapper.map(newCategory,Category.class);
        categoryService.updateCategory(category);
        return ResponseEntity.ok().body(newCategory);
    }
    //deleteCategoryById
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
    }

}
