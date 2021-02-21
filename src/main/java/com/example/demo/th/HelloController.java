package com.example.demo.th;

import com.example.demo.rest.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    List<User> users = new ArrayList<>();

    @GetMapping("/hello")
    public String showHello(final ModelMap modelMap) {
        modelMap.addAttribute("text", "Welcome");
        modelMap.addAttribute("user", new User());
        modelMap.addAttribute("users", users);
        return "welcome";
    }

    @PostMapping("/adduser")
    public String createUser(@Valid User user, BindingResult result, Errors error){
        System.out.println(error);
        if (result.hasErrors()) {
            return "welcome";
        }
        users.add(user);
        return "redirect:/hello";
    }

}
