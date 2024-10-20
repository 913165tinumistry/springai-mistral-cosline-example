package com.example.springaimistralsimilake001.controller;

import com.example.springaimistralsimilake001.service.AppService;
import org.springframework.ai.document.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    AppService appService;

    @GetMapping("/loaddata")
    public String loaddata() {
        appService.loaddata();
        return "Data loaded successfully";
    }

    @GetMapping("/search")
    public List<Document> search(@RequestParam String query) {
        return appService.search(query);
    }
}