package com.springBoot.mvc.controllers;

import com.springBoot.mvc.model.repositories.AuthorRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorRepository.findAll());
		return "authors/authors";
    }

}
