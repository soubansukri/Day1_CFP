package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/get")
    public String getName(){
        return "Souban";
    }

    @GetMapping("/name")
    public String getFirstName(@RequestParam String name){
        return "Hello" + "  " + name;
    }

    @GetMapping("/input/{firstName}")
    public String getInput(@PathVariable String firstName){
        return "Hello" + "  " + firstName;
    }

    @PostMapping ("/save")
    public String postSave(@RequestBody User user){
        return "welcome to Bridgelabz" + "  "+ user.firstName + "  " +user.lastName ;
    }
}
