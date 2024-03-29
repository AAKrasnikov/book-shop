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
        List<Genre> genres = jdbcTemplate.query("select  genre.id, parent_id, slug, name, COUNT(genre_id) AS count_id from genre" +
                " JOIN book2genre ON genre.id = book2genre.genre_id" +
                " group by genre_id;", (ResultSet rs, int rowNum) -> {
            Genre genre = new Genre();
            genre.setId(rs.getInt("id"));
            genre.setParent_id(rs.getInt("parent_id"));
            genre.setSlug(rs.getString("slug"));
            genre.setName(rs.getString("name"));
            genre.setCount(rs.getInt("count_id"));
            return genre;
        });
        return new ArrayList<>(genres);
    }

//    метод, который берет list из метода getGenresListData() и для каждого genre собирает все child
//    SELECT * FROM GENRE where parent_id = genre.getId;
//
//    public List<Genre> getGenresListData() {
//        List<Genre> genres = getAllGenres();
//
//        for(Genre genre : genres) {
//            List<Genre> genreChild = jdbcTemplate.query
//                    ("SELECT * FROM genre WHERE parent_id = " + genre.getId() + ";",
//                            (ResultSet rs, int rowNum) -> {
//                        Genre g = new Genre();
//                        g.setId(rs.getInt("id"));
//                        g.setParent_id(rs.getInt("parent_id"));
//                        g.setSlug(rs.getString("slug"));
//                        g.setName(rs.getString("name"));
//                        return g;
//                    });
//        }
//        System.out.println("fdsaf");
//        return null;
//    }
}
