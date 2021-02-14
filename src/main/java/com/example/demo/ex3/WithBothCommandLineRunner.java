package com.example.demo.ex3;

import com.example.demo.DummyLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WithBothCommandLineRunner implements CommandLineRunner {

    private final List<DummyLogger> loggers;

    public WithBothCommandLineRunner(final List<DummyLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void run(final String... args) throws Exception {
        loggers.forEach(DummyLogger::sayHello);
    }
}