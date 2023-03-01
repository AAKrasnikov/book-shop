package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SignInPageController {
    private final SignInService signInService;

    @Autowired
    public SignInPageController(SignInService signInService) {
        this.signInService = signInService;
    }

    @ModelAttribute("signPage")
    public void pageSignIn() {

    }

    @GetMapping("/signin")
    public String signInPageSite() {
        return "/signin";
    }
}
