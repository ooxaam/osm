package com.engine.oms.jpa;

import com.engine.oms.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryJpaDataService extends JpaRepository<Category, Long> {

}
