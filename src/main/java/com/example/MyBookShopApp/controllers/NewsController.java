package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.service.BookService;
import com.example.MyBookShopApp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class NewsController {
    private final NewsService newsService;
    private final BookService bookService;

    @Autowired
    public NewsController(NewsService newsService, BookService bookService) {
        this.newsService = newsService;
        this.bookService =bookService;
    }

    @ModelAttribute("newsBooks")
    public List<Book> newsBooks () {
        return bookService.getBooksNew();
    }

    @GetMapping("/books/recent")
    public String newsPage () {
        return "/books/recent";
    }
}
