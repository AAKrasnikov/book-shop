package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.service.AboutCompanyService;
import com.example.MyBookShopApp.service.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DocumentsPageController {
    private final DocumentsService documentsService;

    @Autowired
    public DocumentsPageController(DocumentsService documentsService) {
        this.documentsService = documentsService;
    }

    @ModelAttribute("documentationsPage")
    public void documentationsPage() {

    }

    @GetMapping("/documents")
    public String aboutCompanyPage() {
        return "/documents/index";
    }
}
