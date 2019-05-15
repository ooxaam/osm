package com.engine.oms.controller;

import static com.engine.oms.util.Util.buildListJson;
import static com.engine.oms.util.Util.buildObjectJson;

import com.engine.oms.model.Customer;
import com.engine.oms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/CustomerController/customers") 
    public String getCustomers() {
        return buildListJson(customerService.getCustomers());
    }

    @PostMapping(path = "/CustomerController/addCustomer")
    public String addCustomer(Customer customer) {
        return buildObjectJson(customerService.addCustomer(customer));
    }

    @PostMapping(path = "/CustomerController/updateCustomer")
    public String updateCustomer(Customer customer) {
        return buildObjectJson(customerService.updateCustomer(customer));
    }
    
}
