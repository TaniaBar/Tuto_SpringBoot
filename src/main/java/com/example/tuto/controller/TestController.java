package com.example.tuto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/string")
    public String getString(){
        return "Chaine de caractères transmise par tuto";
    }
}
//https://www.youtube.com/watch?v=k6Nmt-l1Bzc min 23:25