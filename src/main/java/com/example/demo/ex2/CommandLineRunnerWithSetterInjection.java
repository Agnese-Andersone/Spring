package com.example.demo.ex2;

import com.example.demo.DummyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {
    @Autowired
    private DummyLogger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello();
    }

    @Autowired
    public void setDummyLogger(final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

}
