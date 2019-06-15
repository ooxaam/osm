package com.engine.oms.service.order;

import com.engine.oms.jpa.OrderJpaDataService;
import com.engine.oms.model.Order;
import com.engine.oms.service.DishService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Resource
    private OrderJpaDataService orderJpaDataService;
    
    @Autowired private DishService dishService;
    
    public List<Order> getOrders() {
        return new ArrayList<>(orderJpaDataService.findAll());
    }

	public OrderFormDetails displayOrder() {
		return OrderFormDetails.builder()
							.dishes(dishService.getDishes())
							.build();
	}
    
	public String  createOrder(OrderFormDetails orderFormDetails) {
		return null;
	}
    
}
