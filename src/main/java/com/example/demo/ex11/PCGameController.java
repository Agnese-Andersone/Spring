package com.example.demo.ex11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PCGameController {
    @GetMapping("/pc-games")
    public String home(ModelMap map){
        map.addAttribute("pcGameForm", new PCGameForm());
        map.addAttribute("createMessage", "Create PC Game");
        return  "pcgame";
    }
    @PostMapping("/saveGame")
    public String save(PCGameForm pcGameForm, ModelMap map){
        map.addAttribute("pcgame_info", pcGameForm);
        return "pcgame_info";
    }


}
