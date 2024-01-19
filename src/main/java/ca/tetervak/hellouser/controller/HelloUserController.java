package ca.tetervak.hellouser.controller;

import ca.tetervak.hellouser.model.AppUser;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloUserController {

    private final Logger log = LoggerFactory.getLogger(HelloUserController.class);

    @GetMapping("/")
    public String input(){
        log.trace("called input()");
        return "Input";
    }


    @GetMapping("/output")
    public String output(
            @RequestParam String firstName,
            @RequestParam String lastName,
            Model model){

        log.trace("called output()");

        var user = new AppUser(firstName, lastName);

        log.debug("user = " + user);

        model.addAttribute("appUser", user);

        return "Output";
    }

}
