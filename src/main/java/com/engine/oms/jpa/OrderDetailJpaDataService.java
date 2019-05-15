package com.engine.oms.jpa;

import com.engine.oms.model.OrderDetail;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailJpaDataService extends JpaRepository<OrderDetail, Long> {

    List<OrderDetail> findByOrderId(Integer orderId);
}
