package com.engine.oms.jpa;

import com.engine.oms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerJpaDataService extends JpaRepository<Customer, Long> {

}
