package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;


@Service
public interface CategoryService {
    List<Category> getAllCategories();
    Category createCategory (Category category);
    Category findCategorybyid(Long id);
    Category updateCategory(Long id, Category category);
    
}
