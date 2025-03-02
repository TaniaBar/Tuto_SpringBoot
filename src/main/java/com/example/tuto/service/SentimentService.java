package com.example.tuto.service;

import com.example.tuto.dao.SentimentDao;
import com.example.tuto.entities.Client;
import com.example.tuto.entities.Sentiment;
import com.example.tuto.enums.TypeSentiment;
import org.springframework.stereotype.Service;

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

        if (sentiment.getTexte().contains("pas")) {
            sentiment.setType(TypeSentiment.NEGATIF);
        } else {
            sentiment.setType(TypeSentiment.POSITIF);
        }
        this.sentimentDao.save(sentiment);
    }

    public List<Sentiment> rechercheSentiments(TypeSentiment typeSentiment) {
        if (typeSentiment == null) {
            return this.sentimentDao.findAll();
        } else {
            return this.sentimentDao.findByType(typeSentiment);
        }
    }

    public void deleteSentiment(int id) {
        this.sentimentDao.deleteById(id);
    }
}
