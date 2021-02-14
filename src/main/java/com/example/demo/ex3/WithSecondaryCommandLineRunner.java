package com.example.demo.ex3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WithSecondaryCommandLineRunner implements CommandLineRunner {


   private final DummyLoggerInterface dummyLoggerInterface;

    public WithSecondaryCommandLineRunner(@Qualifier("secondDummyLogger") DummyLoggerInterface dummyLoggerInterface) {
        this.dummyLoggerInterface = dummyLoggerInterface;
    }

    @Override
    public void run(final String... args) throws Exception {
        dummyLoggerInterface.sayHello();
    }
}