package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    private final TagsRepository tagsRepository;

    @Autowired
    public TagService (TagsRepository tagsRepository) {
        this.tagsRepository = tagsRepository;
    }

    public List<String> getTagsBook() {
        return tagsRepository.getTagsDataBooks();
    }
}
