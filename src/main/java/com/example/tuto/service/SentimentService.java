package com.example.tuto.service;

import com.example.tuto.dao.SentimentDao;
import com.example.tuto.entities.Sentiment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SentimentService {

    private SentimentDao sentimentDao;

    public SentimentService(SentimentDao sentimentDao) {
        this.sentimentDao = sentimentDao;
    }

    public void creerSentiment(Sentiment sentiment) {
        this.sentimentDao.save(sentiment);
    }
}
