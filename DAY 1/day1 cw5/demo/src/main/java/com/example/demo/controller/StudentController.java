package com.example.demo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;

@RestController
public class StudentController {
    @GetMapping("/student")
    public List<StudentModel> getDetails() // Corrected return type
    {
        List<StudentModel> object = new LinkedList<>(); // Corrected type
        StudentModel s1 = new StudentModel("John"); // Corrected object creation
        StudentModel s2 = new StudentModel("Nivash");  // Corrected object creation
        object.add(s1);   
        object.add(s2);   
        return object;
    }
}
