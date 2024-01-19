package ca.tetervak.hellouser.controller;

import ca.tetervak.hellouser.model.AppUser;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloUserController {

    private Logger log = LoggerFactory.getLogger(HelloUserController.class);

    @GetMapping("/")
    public String input(){
        log.trace("called input()");
        return "Input";
    }


    @GetMapping("/output")
    public String output(
            @ModelAttribute AppUser user,
            Model model){

        log.trace("called output()");

        log.debug("user = " + user);

        model.addAttribute("appUser", user);

        return "Output";
    }

}
