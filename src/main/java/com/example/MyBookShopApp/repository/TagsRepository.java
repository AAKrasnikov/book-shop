package com.example.MyBookShopApp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TagsRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TagsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> getTagsDataBooks() {
        List<String> tags = jdbcTemplate.queryForList("SELECT tag FROM tags;", String.class);
        return new ArrayList<>(tags);
    }
}
