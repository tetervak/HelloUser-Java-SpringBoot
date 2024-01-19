package ca.tetervak.hellouser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloUserController {

    @GetMapping("/")
    public String output(Model model){

        var userName = "Jane";

        model.addAttribute("name", userName);

        return "Output";
    }

}
