package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

/*    public List<Book> getBooksNew() {
        return bookRepository.getBooksDataNew();
    }*/

    public List<Book> getBooksBestseller() {
        return bookRepository.getBooksDataBestseller();
    }

    public List<Book> getBooksRecommended() {
        return bookRepository.getBooksDataRecommended();
    }
}
