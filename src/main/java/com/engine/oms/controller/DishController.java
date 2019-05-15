package com.engine.oms.controller;

import static com.engine.oms.util.Util.buildListJson;
import static com.engine.oms.util.Util.buildObjectJson;

import com.engine.oms.model.Dish;
import com.engine.oms.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DishController {

    @Autowired
    private DishService dishService;

    @PostMapping(path = "/DishController/dishes") 
    public String getDishes() {
        return buildListJson(dishService.getDishes());
    }

    @PostMapping(path = "/DishController/addDish")
    public String addDish(Dish dish) {
        return buildObjectJson(dishService.addDish(dish));
    }

}
