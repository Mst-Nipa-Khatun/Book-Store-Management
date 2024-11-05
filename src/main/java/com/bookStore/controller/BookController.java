package com.bookStore.controller;

import com.bookStore.entity.Book;
import com.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    public ModelAndView getAllBook() {
        List<Book> bookList = bookService.getAllBook();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("bookList", bookList);
//        modelAndView.setViewName("available_books");
        return new ModelAndView("modelAndView","bookList",bookList);
    }
    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/available_books";
    }

}
