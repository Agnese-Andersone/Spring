package com.example.demo.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CRUDRest {

    List<User> users = new ArrayList<>();

    @GetMapping ("/name/{personalId}")
    public String getRandomBoolean(@PathVariable("personalId") String id){
    return "Agnese " + id;
    }


    @PostMapping("/user/new")
    public String createUser(@RequestBody User user){
        users.add(user);
        return "OK" + user.getName();
    }
    @PutMapping("/user/update")
    public String updateUser(@RequestBody User user){
        for(User user1: users){
            if(user1.getName().equals(user.getName())){
                user1.setEmail((user1.getEmail()));
            }
        }
        return "OKIdoki " + user.getName();
    }

    @GetMapping("/user/all")
    public List<User> getAllUsers(){
        return users;
    }

    @DeleteMapping ("/user/{name}")
    public String deleteUser(@PathVariable("name") String name){
        for (User user : users) {
            if(user.getName().equals(name)){
                users.remove(user);
                break;
            }
        }
        return  "Okiii";
    }

    /*
    ar Postman var smuki notestēt
     */
}
