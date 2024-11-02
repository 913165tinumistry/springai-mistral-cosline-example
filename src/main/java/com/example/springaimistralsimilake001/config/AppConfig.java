package com.example.springaimistralsimilake001.config;

import org.similake.client.config.SimilakeConfig;
import org.similake.client.properties.SimilakeProperties;
import org.similake.client.store.SimilakeVectorStore;
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
    public SimilakeVectorStore vectorStore(EmbeddingModel embdeddingModel,SimilakeProperties properties) {
        return new SimilakeVectorStore(embdeddingModel,properties);
    }

    @Bean
    public SimilakeProperties  initProperties() {
     /*   SimilakeProperties properties = new SimilakeProperties();
        properties.setHost(environment.getProperty("spring.ai.vectorstore.similake.host"));*/

        return new SimilakeProperties();
    }

    @Bean
    public SimilakeConfig similakeConfig( Environment env) {
        return new SimilakeConfig(env);
    }
}
