package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.service.AboutCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class AboutCompanyController {
    private final AboutCompanyService aboutCompanyService;

    @Autowired
    public AboutCompanyController(AboutCompanyService aboutCompanyService) {
        this.aboutCompanyService = aboutCompanyService;
    }

    @ModelAttribute("aboutCompany")
    public void aboutCompany() {

    }

    @GetMapping("/about")
    public String aboutCompanyPage() {
        return "/about";
    }
}
