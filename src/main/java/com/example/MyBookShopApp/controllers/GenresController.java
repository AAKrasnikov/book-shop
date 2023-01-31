package com.example.MyBookShopApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/genresPage")
public class GenresController {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GenresController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/genres")
    public String genresPage() {
        return "genres";
    }
}
