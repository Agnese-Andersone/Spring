package com.example.demo.ex12;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.config.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SecurityConf extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/api/cars").hasAnyRole("ADMIN", "CARS")
//                .antMatchers(HttpMethod.POST, "/api/cars").authenticated()
//                .antMatchers("/api/users/**").hasAnyAuthority("ROLE_USER_ADMIN")
//                .anyRequest().permitAll()
//                .and()
//                .httpBasic()
//                .and()
//                .headers().frameOptions().disable()
//                .and()
//                .csrf()
//                .disable();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("{noop}Secret_123")
//                .roles("ADMIN", "CARS")
//                .and()
//                .withUser("admin2")
//                .password("{noop}Secret_123")
//                .authorities("ROLE_USER_ADMIN")
//                .and()
//                .withUser("admin3")
//                .password("{noop}Secret_123")
//                .roles("CARS");
//    }
//}
