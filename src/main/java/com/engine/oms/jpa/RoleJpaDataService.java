package com.engine.oms.jpa;

import com.engine.oms.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleJpaDataService extends JpaRepository<Role, Long>{
}
