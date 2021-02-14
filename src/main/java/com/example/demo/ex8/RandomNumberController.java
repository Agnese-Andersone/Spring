package com.example.demo.ex8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberController {

    private final RandomBooleanProvider randomBooleanProvider;


    public RandomNumberController(RandomBooleanProvider randomBooleanProvider) {
        this.randomBooleanProvider = randomBooleanProvider;
    }

    @GetMapping("/api/random-boolean")
    public Boolean getRandomBoolean() {
        return randomBooleanProvider.getValue();
    }

}
