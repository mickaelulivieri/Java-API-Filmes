package com.filmes.service;

import com.filmes.entity.Category;
import com.filmes.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryService() {
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

}
