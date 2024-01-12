package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryServiceImpli implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
    @Override 
    public Category findCategorybyid(Long id){
        return categoryRepository.findById(id).orElse(null);
    }
    @Override
    public Category updateCategory(Long id, Category category){
        Category existingCategory=categoryRepository.findById(id).orElse(null);

        if(existingCategory !=null){ //if category is found in the database
            existingCategory.setName(category.getName());//update the name from user's input
            return categoryRepository.save(existingCategory);

        }else{ //else return null
            return null;
        }

    }

    
}
