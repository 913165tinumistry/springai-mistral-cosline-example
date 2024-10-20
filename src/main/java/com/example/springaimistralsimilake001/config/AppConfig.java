package com.example.springaimistralsimilake001.config;

import org.similake.client.store.SimilakeVectorStore;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SimilakeVectorStore vectorStore(EmbeddingModel embdeddingModel) {
        return new SimilakeVectorStore(embdeddingModel);
    }
}
