package ca.tetervak.hellouser.controller;

import ca.tetervak.hellouser.model.AppUser;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


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
            @Validated @ModelAttribute AppUser appUser,
            BindingResult bindingResult,
            Model model){

        log.trace("called output()");

        log.debug("user = " + appUser);


        model.addAttribute("appUser", appUser);

        if(bindingResult.hasErrors()){
            return "Retry";
        }

        return "Output";
    }

}
