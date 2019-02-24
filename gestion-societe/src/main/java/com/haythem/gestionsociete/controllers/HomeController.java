package com.haythem.gestionsociete.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final String WELCOME_MESSAGE = "welcome to the home page.";

    @GetMapping("/")
    public String index(){
         return WELCOME_MESSAGE;
    }
}
