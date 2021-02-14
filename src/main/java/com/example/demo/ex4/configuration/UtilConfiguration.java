package com.example.demo.ex4.configuration;

import com.example.demo.ex4.DummyLogger;
import com.example.demo.ex4.ListUtil;
import com.example.demo.ex4.StringUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {
    @Bean
    public DummyLogger dummyLogger() {
        return new DummyLogger();
    }

    @Bean
    public ListUtil listUtility(){
        return new ListUtil();
    }

    @Bean(name = "stringUtility")
    public StringUtil stringUtil() {
        return new StringUtil();
    }
}
