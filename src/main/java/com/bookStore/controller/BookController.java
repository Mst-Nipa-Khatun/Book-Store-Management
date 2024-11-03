package com.bookStore.controller;

import com.bookStore.entity.Book;
import com.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String index() {
    return "index";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public String getAllBook() {
        return "bookList";
    }
    @PostMapping("/save")
    public String saveBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect/available_books";
    }

}
