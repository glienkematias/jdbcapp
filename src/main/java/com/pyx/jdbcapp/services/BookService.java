package com.pyx.jdbcapp.services;

import com.pyx.jdbcapp.model.Book;
import com.pyx.jdbcapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }

    public Long createBook(Book newBook) {
        return bookRepository.createBook(newBook);
    }
}
