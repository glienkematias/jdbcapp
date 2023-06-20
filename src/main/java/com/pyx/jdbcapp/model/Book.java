package com.pyx.jdbcapp.model;

public class Book {

    public final Long id;
    public final String name;

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
