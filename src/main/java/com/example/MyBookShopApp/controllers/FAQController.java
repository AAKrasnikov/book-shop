package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.service.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class FAQController {
    private final FAQService faqService;

    @Autowired
    public FAQController(FAQService faqService) {
        this.faqService = faqService;
    }

    @ModelAttribute("faq")
    public void faq() {

    }

    @GetMapping("/faq")
    public String faqPage() {
        return "/faq";
    }
}
