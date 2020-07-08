package com.kloia.dojohelloworldjava;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private com.kloia.dojohelloworldjava.BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(String name) {
        repository.save(new Book(name));
    }
}
