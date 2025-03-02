package com.example.tuto.controller;

import com.example.tuto.entities.Sentiment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "api/sentiment", produces = APPLICATION_JSON_VALUE)
public class SentimentController {

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creerSentiment(@RequestBody Sentiment sentiment) {

    }
}
