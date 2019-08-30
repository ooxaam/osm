package com.engine.oms.jpa;

import com.engine.oms.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaDataService extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
