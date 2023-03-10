package com.example.MyBookShopApp.repository;

import com.example.MyBookShopApp.data.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

/*    public List<Book> getBooksDataNew() {
        List<Book> books = jdbcTemplate.query(
                "SELECT * FROM books " +
                        "JOIN parameter_books ON books.parameter_id = parameter_books.id" +
                        " WHERE parameter_books.NEW = 'X'", (ResultSet rs, int rowNum) -> {
                    Book book = new Book();
                    book.setId(rs.getInt("id"));
                    book.setAuthor(rs.getString("author"));
                    book.setTitle(rs.getString("title"));
                    book.setPriceOld(rs.getString("priceOld"));
                    book.setPrice(rs.getString("price"));
                    book.setParameterId(rs.getInt("parameter_id"));
                    return book;
                });
        return new ArrayList<>(books);
    }*/

/*    public List<Book> getBooksDataPopular() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books " +
                "JOIN parameter_books ON books.parameter_id = parameter_books.id" +
                " WHERE parameter_books.popular = 'X'", (ResultSet rs, int rowNum) -> {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setAuthor(rs.getString("author"));
            book.setTitle(rs.getString("title"));
            book.setPriceOld(rs.getString("priceOld"));
            book.setPrice(rs.getString("price"));
            book.setParameterId(rs.getInt("parameter_id"));
            return book;
        });
        return new ArrayList<>(books);
    }*/

    public List<Book> getBooksDataRecommended() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books ", (ResultSet rs, int rowNum) -> {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setAuthor(rs.getString("author"));
            book.setTitle(rs.getString("title"));
            book.setPriceOld(rs.getString("priceOld"));
            book.setPrice(rs.getString("price"));
            book.setParameterId(rs.getInt("parameter_id"));
            return book;
        });
        return new ArrayList<>(books);
    }
}
