package com.example.demo.security;

//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class UserService implements UserDetailsService {
//
//    private final BCryptPasswordEncoder encoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//        if(login.equals("Deniss")){
//            throw new UsernameNotFoundException("No user with this login is welcome here");
//        }
//        return new User(
//                login,
//                encoder.encode( "password"),
//                List.of(new SimpleGrantedAuthority("ROLE_SEE_WELCOME"))
//        );
//    }
//}

