package com.market.controllers;

import com.market.models.HardwareCategory;
import com.market.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/getOverallCategoryList", method = RequestMethod.GET)
    @ResponseBody
    public List<HardwareCategory> getOverallCategoryList() {
        return categoryService.getCategoryList();
    }

    @RequestMapping(value = "/allCategoryItems", method = RequestMethod.GET)
    public String fetchCategories() {
        return "categoryItems";
    }
}
