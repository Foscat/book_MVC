package com.springBoot.mvc.controllers;

import com.springBoot.mvc.model.repositories.BookRepository;

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
    public String getBooks(Model model){

        // This will make prop 'books' equal the command and the tlist output of all books in db
        model.addAttribute("books", bookRepository.findAll());

        // Establish 'books' as a thymeleaf view component
        return "books/books";

    }

}
