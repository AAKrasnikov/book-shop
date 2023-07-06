package com.example.MyBookShopApp.repository;
import com.example.MyBookShopApp.data.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GenresRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GenresRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Genre> getGenresListData() {
        List<Genre> genres = jdbcTemplate.query ("SELECT * FROM genre", (ResultSet rs, int rowNum) -> {
                    Genre genre = new Genre();
                    genre.setId(rs.getInt("id"));
                    genre.setParent_id(rs.getInt("parent_id"));
                    genre.setSlug(rs.getString("slug"));
                    genre.setName(rs.getString("name"));
                    return genre;
                });
        return new ArrayList<>(genres);
    }
}
