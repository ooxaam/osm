package com.engine.oms.jpa;

import com.engine.oms.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaDataService extends JpaRepository<Order, Long> {

}
