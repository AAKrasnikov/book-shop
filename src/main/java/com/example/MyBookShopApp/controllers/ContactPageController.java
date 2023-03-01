package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.service.ContactPageService;
import com.example.MyBookShopApp.service.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ContactPageController {
    private final ContactPageService contactPageService;

    @Autowired
    public ContactPageController(ContactPageService contactPageService) {
        this.contactPageService = contactPageService;
    }

    @ModelAttribute("contact")
    public void contact() {

    }

    @GetMapping("/contacts")
    public String contactPage() {
        return "/contacts";
    }
}
