package com.example.tuto.service;

import com.example.tuto.dao.SentimentDao;
import com.example.tuto.entities.Client;
import com.example.tuto.entities.Sentiment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SentimentService {

    private ClientService clientService;
    private SentimentDao sentimentDao;

    public SentimentService(SentimentDao sentimentDao, ClientService clientService) {
        this.sentimentDao = sentimentDao;
        this.clientService = clientService;
    }

    public void creerSentiment(Sentiment sentiment) {

        Client client = this.clientService.lireOuCreer(sentiment.getClient());
        sentiment.setClient(client);
        this.sentimentDao.save(sentiment);
    }

    public List<Sentiment> rechercheSentiments() {
        return this.sentimentDao.findAll();
    }
}
