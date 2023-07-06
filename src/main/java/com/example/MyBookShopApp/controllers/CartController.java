package com.example.MyBookShopApp.controllers;
import com.example.MyBookShopApp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @ModelAttribute("cart")
    public void cart() {
    }

    @GetMapping("/cart")
    public String cartPage() {
        return "/cart";
    }
}
