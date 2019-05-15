package com.engine.oms.controller;

import static com.engine.oms.util.Util.buildListJson;
import static com.engine.oms.util.Util.buildObjectJson;

import com.engine.oms.model.Category;
import com.engine.oms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(path = "/CategoryController/categories") 
    public String getCategories() {
        return buildListJson(categoryService.getCategories());
    }

    @PostMapping(path = "/CategoryController/addCategory")
    public String addCategory(Category category) {
        return buildObjectJson(categoryService.addCategory(category));
    }

}
