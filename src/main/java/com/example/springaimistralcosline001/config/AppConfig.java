package com.example.springaimistralcosline001.config;


import org.cosline.client.config.CoslineConfig;
import org.cosline.client.properties.CoslineProperties;
import org.cosline.client.store.CoslineVectorStore;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


@Configuration
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean
    public CoslineVectorStore vectorStore(EmbeddingModel embdeddingModel,CoslineProperties properties) {
        return new CoslineVectorStore(embdeddingModel,properties);
    }

    @Bean
    public CoslineProperties  initProperties() {
        return new CoslineProperties();
    }

    @Bean
    public CoslineConfig coslineConfig( Environment env) {
        return new CoslineConfig(env);
    }
}
