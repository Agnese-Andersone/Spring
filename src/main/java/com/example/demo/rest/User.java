package com.example.demo.rest;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class User {
    public String name;
    @Email(message="Bad email")
    public String email;

    /**
     * {
     *     "name":"sdfsdf",
     *     "email":"sadfsdf"
     * }
     *
     *
     */

}
