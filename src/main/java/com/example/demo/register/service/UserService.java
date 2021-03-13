package com.example.demo.register.service;


import com.example.demo.register.entities.User;
import com.example.demo.register.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByLogin(String login);

    User save(UserRegistrationDto registration);
}
