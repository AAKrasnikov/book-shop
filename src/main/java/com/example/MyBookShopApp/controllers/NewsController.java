package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class NewsController {
    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @ModelAttribute("newsBooks")
    public void newsBooks () {

    }

    @GetMapping("/books/recent")
    public String newsPage () {
        return "/books/recent";
    }
}
