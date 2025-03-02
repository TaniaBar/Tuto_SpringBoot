package com.example.tuto.dao;

import com.example.tuto.entities.Sentiment;
import com.example.tuto.enums.TypeSentiment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SentimentDao extends JpaRepository<Sentiment, Integer> {
    List<Sentiment> findByType(TypeSentiment typeSentiment);
}
