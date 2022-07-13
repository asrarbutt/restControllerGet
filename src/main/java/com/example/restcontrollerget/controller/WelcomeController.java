package com.example.restcontrollerget.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    String name="";
    @GetMapping
    public String welcomeMessage(){
        return "welcome "+name;
    }

    @GetMapping(path="/{name}")
    public String welcomeUser(@PathVariable String name, @RequestParam String q){

        return "your username is: "+name + " "+q;
    }
    @PostMapping("/sendname")
    public String sendPostRequest(@RequestBody String inputName){
        this.name=inputName;
       int nameLenght=name.length();
       String i=String.valueOf(nameLenght);
        return "der name: " + name + "hat eine länge von: "+ i;

    }
}
