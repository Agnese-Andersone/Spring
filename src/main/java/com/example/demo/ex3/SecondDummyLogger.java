package com.example.demo.ex3;

import org.springframework.stereotype.Component;

@Component

public class SecondDummyLogger implements DummyLoggerInterface {

    @Override
    public void sayHello() {
        System.out.println("Hello from SecondDummyLogger");
    }
}
