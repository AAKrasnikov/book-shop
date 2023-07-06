package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.service.SearchPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SearchPageController {

    private final SearchPageService searchPageService;

    @Autowired
    public SearchPageController(SearchPageService searchPageService) {
        this.searchPageService = searchPageService;
    }

    @ModelAttribute("searchPage")
    public void search() {

    }

    @GetMapping("/search/")
    public String cartPage() {
        return "/search/index";
    }
}
