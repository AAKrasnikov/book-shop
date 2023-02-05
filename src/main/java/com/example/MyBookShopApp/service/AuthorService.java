package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.data.Author;
import com.example.MyBookShopApp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Map<Object, List<Author>> getAuthors() {
        return authorRepository.getAuthorsData();
    }
}
