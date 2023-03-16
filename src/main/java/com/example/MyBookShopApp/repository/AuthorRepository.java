package com.example.MyBookShopApp.repository;

import com.example.MyBookShopApp.data.Author;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AuthorRepository {
    private final JdbcTemplate jdbcTemplate;

    public AuthorRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Map<String, List<Author>> getAuthorsData() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM author", (ResultSet rs, int rowNum) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setPhoto(rs.getString("photo"));
            author.setSlug(rs.getString("slug"));
            author.setName(rs.getString("name"));
            author.setDescription(rs.getString("description"));
            return author;
        });
        return authors.stream().collect(Collectors.groupingBy((Author a) -> a.getName().substring(0, 1)));
    }
}
