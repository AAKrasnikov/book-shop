package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Genre;
import com.example.MyBookShopApp.service.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GenresController {
    private final GenresService genresService;

    @Autowired
    public GenresController(GenresService genresService) {
        this.genresService = genresService;
    }

    @ModelAttribute("genresList")
    public List<Genre> getGenres() {
        return genresService.getGenresList();
    }


    @GetMapping("/genres")
    public String genresPage() {
        return "/genres/index";
    }
}
