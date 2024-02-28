package com.example.demo.controller;


import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/students")
    public String createStudent(@RequestBody Student student) {
        return "Student created: " + student.getName() + ", Age: " + student.getAge();
    }
}