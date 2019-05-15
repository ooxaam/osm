package com.engine.oms.service;

import com.engine.oms.jpa.OrderJpaDataService;
import com.engine.oms.model.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Resource
    private OrderJpaDataService orderJpaDataService;
    
    public List<Order> getOrders() {
        return new ArrayList<>(orderJpaDataService.findAll());
    }
    
/*    public Dish addDish(Dish dish) {
        return dishJpaDataService.saveAndFlush(dish);
    }*/
    
}
