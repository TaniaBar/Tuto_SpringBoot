package com.example.tuto.controller;

import com.example.tuto.dao.SentimentDao;
import com.example.tuto.entities.Sentiment;
import com.example.tuto.service.SentimentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "api/sentiment", produces = APPLICATION_JSON_VALUE)
public class SentimentController {

    private SentimentService sentimentService;

    public SentimentController(SentimentService sentimentService) {
        this.sentimentService = sentimentService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creerSentiment(@RequestBody Sentiment sentiment) {
        this.sentimentService.creerSentiment(sentiment);
    }

    @GetMapping
    public @ResponseBody List<Sentiment> getSentiment() {
        return this.sentimentService.rechercheSentiments();
    }
}
