package com.engine.oms.controller;

import static com.engine.oms.util.Util.buildListJson;

import com.engine.oms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(path = "/OrderController/orders") 
    public String getOrders() {
        return buildListJson(orderService.getOrders());
    }

/*    @PostMapping(path = "/OrderController/addDish")
    public String addOrder(Order order) {
        return buildObjectJson(orderService.addDish(order));
    }*/

}
