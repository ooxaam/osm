package com.engine.oms.service;

import com.engine.oms.jpa.CategoryJpaDataService;
import com.engine.oms.model.Category;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Resource
    private CategoryJpaDataService categoryJpaDataService;
    
    public List<Category> getCategories() {
        return new ArrayList<>(categoryJpaDataService.findAll());
        /*categories
                .addAll(categoryJpaDataService.findAll().stream().map(c -> c.getTitle()).collect(Collectors.toList()));
*/
    }
    
    public Category addCategory(Category category) {
        return categoryJpaDataService.saveAndFlush(category);
    }
    
}
