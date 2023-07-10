package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.service.BookService;
import com.example.MyBookShopApp.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.List;

@Controller
public class MainPageController {

    private final BookService bookService;
    private final TagService tagService;

    @Autowired
    public MainPageController(BookService bookService, TagService tagService) {
        this.bookService = bookService;
        this.tagService = tagService;
    }

    @ModelAttribute("recommendedBooks")
    public List<Book> recommendedBooks() {
        return bookService.getBooksRecommended();
    }

    @ModelAttribute("newBooks")
    public List<Book> newBooks() {
        return bookService.getBooksNew();
    }

    @ModelAttribute("bestsellerBooks")
    public List<Book> bestsellerBooks() {
        return bookService.getBooksBestseller();
    }

    @ModelAttribute("tags")
    public List<String> tagsBook () {
        return tagService.getTagsBook();
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }
}
