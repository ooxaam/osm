package com.engine.oms.service;

import com.engine.oms.auth.User;
import com.engine.oms.jpa.RoleJpaDataService;
import com.engine.oms.jpa.UserJpaDataService;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserJpaDataService userRepository;
    @Autowired private RoleJpaDataService roleRepository;
    @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}