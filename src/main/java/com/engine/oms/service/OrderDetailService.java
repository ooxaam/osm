package com.engine.oms.service;

import com.engine.oms.jpa.OrderDetailJpaDataService;
import com.engine.oms.model.OrderDetail;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {

    @Resource
    private OrderDetailJpaDataService orderDetailJpaDataService;
    
    public List<OrderDetail> getOrderDetails(Long id) {
        return new ArrayList<>(orderDetailJpaDataService.findByOrderId(id.intValue()));
    }
    
/*    public Dish addDish(Dish dish) {
        return dishJpaDataService.saveAndFlush(dish);
    }*/
    
}
