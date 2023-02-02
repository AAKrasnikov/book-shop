package com.example.MyBookShopApp.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AuthorRepository {
    private final JdbcTemplate jdbcTemplate;

    public AuthorRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public Map<Object, List<Author>> getAuthorsData() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM author", (ResultSet rs, int rowNum) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            author.setSurname(rs.getString("surname"));
            author.setFullName(rs.getString("full_name"));
            return author;
        });
        return authors.stream()
                .collect(
                        Collectors.groupingBy(
                                author -> author.getSurname().charAt(0)));
    }
}
