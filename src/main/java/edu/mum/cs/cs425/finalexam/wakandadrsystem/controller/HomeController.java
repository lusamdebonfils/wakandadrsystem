package edu.mum.cs.cs425.finalexam.wakandadrsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/wakanda"})
    public String displayHome(){
        return "index";
    }

}
