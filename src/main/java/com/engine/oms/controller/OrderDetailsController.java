package com.engine.oms.controller;

import static com.engine.oms.util.Util.buildListJson;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import com.engine.oms.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsController {

    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping(path = "/OrderDetailsController/orderDetails/{orderId}" , produces = APPLICATION_JSON_UTF8_VALUE,
            consumes = APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST)
    public String getOrderDetails(@PathVariable("orderId") String orderId) {
        return buildListJson(orderDetailService.getOrderDetails(Long.parseLong(orderId)));
    }

/*    @PostMapping(path = "/OrderController/addDish")
    public String addOrder(Order order) {
        return buildObjectJson(orderService.addDish(order));
    }*/

}
