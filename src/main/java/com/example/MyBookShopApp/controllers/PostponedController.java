package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.service.PostponedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PostponedController {

    private final PostponedService postponedService;

    @Autowired
    public PostponedController(PostponedService postponedService) {
        this.postponedService = postponedService;
    }

    @ModelAttribute("postponed")
    public void postponed() {

    }

    @GetMapping("/postponed")
    public String postponedPage() {
        return "/postponed";
    }
}
