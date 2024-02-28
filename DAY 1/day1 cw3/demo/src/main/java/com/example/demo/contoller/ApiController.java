package com.example.demo.contoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/favouriteColor")
    public String favColor(@RequestParam String color){
        return "My favorite color is " +color+"!";
    }
}