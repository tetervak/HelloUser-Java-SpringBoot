package ca.tetervak.hellouser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloUserController {

    @GetMapping("/")
    public String output(){
        return "Output";
    }

}