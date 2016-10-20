package com.market.services;

import com.market.models.HardwareCategory;
import com.market.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<HardwareCategory> getCategoryList() {
        return categoryRepository.getAllCategoryList();
    }
}
