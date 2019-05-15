package com.engine.oms.service;

import com.engine.oms.jpa.DishJpaDataService;
import com.engine.oms.model.Dish;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DishService {

    @Resource
    private DishJpaDataService dishJpaDataService;
    
    public List<Dish> getDishes() {
        return new ArrayList<>(dishJpaDataService.findAll());
    }
    
    public Dish addDish(Dish dish) {
        return dishJpaDataService.saveAndFlush(dish);
    }
    
}
