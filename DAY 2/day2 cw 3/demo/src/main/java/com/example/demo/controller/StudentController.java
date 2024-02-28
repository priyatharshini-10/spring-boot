package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getresult() {
        Student p=new Student(1L,"John Doe","This is a student description");
        return p;
    }
    
}