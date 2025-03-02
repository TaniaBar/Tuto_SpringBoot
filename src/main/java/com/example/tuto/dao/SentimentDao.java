package com.example.tuto.dao;

import com.example.tuto.entities.Sentiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentimentDao extends JpaRepository<Sentiment, Integer> {
}
