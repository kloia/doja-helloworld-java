package com.kloia.dojohelloworldjava;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ListIterator;

@RestController
public class BookController {
    private final BookService bookService;
    private BookRepository repository;

    public BookController(BookService bookService, BookRepository repository) {
        this.bookService = bookService;
        this.repository = repository;
    }

    @GetMapping("/getBook")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String getBook(@RequestParam("book") String name) {
        return repository.findByName(name).get(0).getName();
    }
    @GetMapping("/addBook")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addBook(@RequestParam("book") String name) {
        bookService.addBook(name);
    }
}
