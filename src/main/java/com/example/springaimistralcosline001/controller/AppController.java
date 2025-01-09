package com.example.springaimistralcosline001.controller;

import com.example.springaimistralcosline001.service.AIService;

import org.springframework.ai.document.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AppController {

    @Autowired
    AIService appService;

    @GetMapping("/loaddata")
    public String loaddata() {
        appService.loaddata();
        return "Data loaded successfully";
    }

    @GetMapping("/search")
    public List<String> search(@RequestParam String query) {
        List<Document> docs = appService.search(query);
        List<String> docContents = docs.stream()
                .map(Document::getContent)
                .collect(Collectors.toList());
        return docContents;
    }
}