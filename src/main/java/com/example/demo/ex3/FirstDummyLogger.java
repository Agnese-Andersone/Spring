package com.example.demo.ex3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FirstDummyLogger implements DummyLoggerInterface {
    @Override
    public void sayHello() {
        System.out.println(FirstDummyLogger.class.getName());
    }
}
