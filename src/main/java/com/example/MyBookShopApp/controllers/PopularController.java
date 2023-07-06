package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.service.PopularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PopularController {
    private final PopularService popularService;

    @Autowired
    public PopularController(PopularService popularService) {
        this.popularService = popularService;
    }

    @ModelAttribute("popularBooks")
    public void popularBooks () {

    }

    @GetMapping("/books/popular")
    public String popularPage() {
        return "/books/popular";
    }
}
