package com.example.demo.controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BookController {
    @GetMapping("/book")
    public Book getdetails() {
        Book b=new Book("The Great Soldier", "G. Gyan", new Date());
        return b;
    }
}