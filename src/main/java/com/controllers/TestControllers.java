package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestControllers {

    @GetMapping("/")
    public String test(){
        return "This is a Test";
    }

}
