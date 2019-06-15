
package com.engine.oms.controller;

import static com.engine.oms.util.Util.buildListJson;

import com.engine.oms.service.order.OrderFormDetails;
import com.engine.oms.service.order.OrderService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("orders")
public class OrderController {

    @Autowired private OrderService orderService;
    
    @GetMapping() 
    public String getOrders() {
        return buildListJson(orderService.getOrders());
    }

    @GetMapping("/viewOrder") 
    public String viewOrders() {
        return "viewOrder";
    }
    
    @GetMapping(path = "/createOrder")
	public ModelAndView displayOrder() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderFormDetails", orderService.displayOrder());
		mav.setViewName("createOrder");
		return mav;
	}
    
	@PostMapping(path = "/createOrder")
	public ModelAndView addOrder(@Valid OrderFormDetails order, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();
		if (bindingResult.hasErrors()) {
			mav.setViewName("createOrder");
			return mav;
		}
		// save to be  done....
		mav.addObject("order", orderService.displayOrder());
		mav.setViewName("createOrder");
		return mav;
	}
}
