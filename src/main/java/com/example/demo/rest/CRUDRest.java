package com.example.demo.rest;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CRUDRest {

    List<User> users = new ArrayList<>();

    @GetMapping("/name/{id}")
    public String getRandomBoolean(@PathVariable("id") String id){
        return "Deniss " + id;
    }

    @PostMapping("/user/new")
    public String createUser(@Valid @RequestBody User user){
        users.add(user);
        return "OK " + user.getName();
    }

    @PutMapping("/user/update")
    public String updateUser(@RequestBody User user){
        for (User user1 : users) {
            if(user1.getName().equals(user.getName())){
                user1.setEmail(user.getEmail());
            }
        }
        return "OK " + user.getName();
    }

    @GetMapping("/user/all")
    public List<User> getAllUsers(){
        return users;
    }

    @DeleteMapping("/user/{name}")
    public String deleteUser(@PathVariable("name") String name){
        for (User user : users) {
            if(user.getName().equals(name)){
                users.remove(user);
                break;
            }
        }
        return "OK";
    }

}
