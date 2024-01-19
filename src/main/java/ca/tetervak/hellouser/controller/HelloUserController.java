package ca.tetervak.hellouser.controller;

import ca.tetervak.hellouser.model.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloUserController {

    @GetMapping("/")
    public String output(Model model){

        var user = new AppUser("Bart", "Simpson");

        model.addAttribute("appUser", user);

        return "Output";
    }

}
