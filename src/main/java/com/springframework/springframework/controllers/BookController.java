package com.springframework.springframework.controllers;

import com.springframework.springframework.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        //model.addAttribute("books", bookRepository.findAll());
        model.addAttribute("books",  bookRepository.findAll());
        return "books";
    }
}
