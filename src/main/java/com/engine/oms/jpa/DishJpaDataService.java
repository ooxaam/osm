package com.engine.oms.jpa;

import com.engine.oms.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishJpaDataService extends JpaRepository<Dish, Long> {

}
