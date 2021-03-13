package com.example.demo.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        if(login.equals("Deniss")){
            throw new UsernameNotFoundException
                      ("No user with this login is registered here");
        }
        return new User(
                login,
                "password",
                List.of(new SimpleGrantedAuthority("USER"))
        );
    }
}
