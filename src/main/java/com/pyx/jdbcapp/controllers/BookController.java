package com.pyx.jdbcapp.controllers;

import com.pyx.jdbcapp.model.Book;
import com.pyx.jdbcapp.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("book")
    public Long createBooks(@RequestBody Book newBook){
        return bookService.createBook(newBook);
    }

}
