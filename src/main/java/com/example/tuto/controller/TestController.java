package com.example.tuto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/string")
    public String getString(){
        return "Chaine de caractères transmise par tuto";
    }

    @GetMapping
    public List<String> getList(){
        return List.of("Chaine de caractères", " transmise par tuto");
    }
}
