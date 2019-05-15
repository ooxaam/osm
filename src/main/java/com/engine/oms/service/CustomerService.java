package com.engine.oms.service;

import com.engine.oms.jpa.CustomerJpaDataService;
import com.engine.oms.model.Customer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Resource
    private CustomerJpaDataService customerJpaDataService;
    
    public List<Customer> getCustomers() {
        return new ArrayList<>(customerJpaDataService.findAll());
    }
    
    public Customer addCustomer(Customer customer) {
        customer.setCreationDate(new Date());
        return customerJpaDataService.saveAndFlush(customer);
    }
    
    public Customer updateCustomer(Customer customer) {
        return customerJpaDataService.saveAndFlush(customer);
    }
    
}
