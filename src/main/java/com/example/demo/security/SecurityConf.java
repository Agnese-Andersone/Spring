package com.example.demo.security;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.config.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
////@Configuration
//@RequiredArgsConstructor
//public class SecurityConf extends WebSecurityConfigurerAdapter {
//
//    private final UserService userService;
//    private final BCryptPasswordEncoder encoder;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers( "/api/**").hasAnyAuthority("ROLE_SEE_WELCOME")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin();
//    }
//
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
//        auth.setUserDetailsService(userService);
//        auth.setPasswordEncoder(encoder);
//        return auth;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authenticationProvider());
//    }
////    In memory Users
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication()
////                .withUser("as")
////                .password(passwordEncoder().encode("asd"))
////                .roles("USER","ADMIN","ANALYST")
////                .and()
////                .withUser("more")
////                .password(passwordEncoder().encode("asd"))
////                .authorities("ROLE_SEE_WELCOME");
////    }
//
//
//
//}
