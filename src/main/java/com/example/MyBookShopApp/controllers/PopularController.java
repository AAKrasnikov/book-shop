package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class PopularController {
    private BookService bookService;

    @Autowired
    public PopularController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("bestsellerBooks")
    public List<Book> bestsellerBooks() {
        return bookService.getBooksBestseller();
    }

    @GetMapping("/books/popular")
    public String popularPage() {
        return "/books/popular";
    }
}
