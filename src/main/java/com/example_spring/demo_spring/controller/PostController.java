package com.example_spring.demo_spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {


    @PostMapping("/firstpost")
    public String FirstPost(){
        return " Ceci est un exercice";
    }
}
