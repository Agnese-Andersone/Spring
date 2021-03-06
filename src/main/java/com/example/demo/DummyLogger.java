package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyLogger implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello!");
    }
    public void sayHello(String text) {
        System.out.println("hello from DummyLogger" + text);
    }

}
