package com.example.demo.ex3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class WithPrimaryCommandLineRunner implements CommandLineRunner {

    private DummyLoggerInterface dummyLoggerInterface;

    public WithPrimaryCommandLineRunner(DummyLoggerInterface dummyLoggerInterface) {
        this.dummyLoggerInterface = dummyLoggerInterface;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLoggerInterface.sayHello();

    }
}