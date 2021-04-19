package com.upgrad.SwaggerExample.controller;


import com.upgrad.SwaggerExample.model.Author;
import com.upgrad.SwaggerExample.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/getAllAuthors",method = RequestMethod.GET)
    public ArrayList<Author> getAllAuthors(){

        return authorService.getAllAuthors();
    }

    @RequestMapping(value = "/addAuthor",method = RequestMethod.POST)
    public Author addAuthor(@RequestBody Author author){

        return authorService.addAuthor(author);

    }


}
