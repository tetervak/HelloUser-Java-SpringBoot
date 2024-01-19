package ca.tetervak.hellouser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloUserController {

    @GetMapping("/")
    public ModelAndView output(){

        var userName = "Jane";

        return new ModelAndView("Output", "name", userName);
    }

}
