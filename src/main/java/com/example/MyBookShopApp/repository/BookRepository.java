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

    public List<Book> getBooksDataNew() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM book " +
                        "JOIN book2author ON book.id = book2author.book_id " +
                        "JOIN author ON book2author.author_id = author.id " +
                        "WHERE pup_date > '2023-03-10';",
                (ResultSet rs, int rowNum) -> {
                    Book book = new Book();
                    book.setId(rs.getInt("id"));
                    book.setPupDate(rs.getDate("pup_date"));
                    book.setIsBestseller(rs.getInt("is_bestseller"));
                    book.setSlug(rs.getString("slug"));
                    book.setTitle(rs.getString("title"));
                    book.setImage(rs.getString("image"));
                    book.setDescription(rs.getString("description"));
                    book.setPrice(rs.getInt("price"));
                    book.setDiscount(rs.getInt("discount"));
                    book.setAuthorName(rs.getString("name"));
                    return book;
                });
        return new ArrayList<>(books);
    }

    public List<Book> getBooksDataBestseller() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM book " +
                        "JOIN book2author ON  book.id = book2author.book_id " +
                        "JOIN author ON book2author.author_id = author.id " +
                        "WHERE book.is_bestseller = 1;",
                (ResultSet rs, int rowNum) -> {
                    Book book = new Book();
                    book.setId(rs.getInt("id"));
                    book.setPupDate(rs.getDate("pup_date"));
                    book.setIsBestseller(rs.getInt("is_bestseller"));
                    book.setSlug(rs.getString("slug"));
                    book.setTitle(rs.getString("title"));
                    book.setImage(rs.getString("image"));
                    book.setDescription(rs.getString("description"));
                    book.setPrice(rs.getInt("price"));
                    book.setDiscount(rs.getInt("discount"));
                    book.setAuthorName(rs.getString("name"));
                    return book;
                });
        return new ArrayList<>(books);
    }

    public List<Book> getBooksDataRecommended() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM book " +
                        "JOIN book2author ON  book.id = book2author.book_id " +
                        "JOIN author ON book2author.author_id = author.id;",
                (ResultSet rs, int rowNum) -> {
                    Book book = new Book();
                    book.setId(rs.getInt("id"));
                    book.setPupDate(rs.getDate("pup_date"));
                    book.setIsBestseller(rs.getInt("is_bestseller"));
                    book.setSlug(rs.getString("slug"));
                    book.setTitle(rs.getString("title"));
                    book.setImage(rs.getString("image"));
                    book.setDescription(rs.getString("description"));
                    book.setPrice(rs.getInt("price"));
                    book.setDiscount(rs.getInt("discount"));
                    book.setAuthorName(rs.getString("name"));
                    return book;
                });
        return new ArrayList<>(books);
    }
}
