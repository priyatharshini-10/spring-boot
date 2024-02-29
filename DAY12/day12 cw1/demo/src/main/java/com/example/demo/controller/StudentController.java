package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    
     @Autowired
    private StudentService studentService;

    @PostMapping("/postbystudent")
    public ResponseEntity<Student> post(@RequestBody Student student) {

        try {
            return new ResponseEntity<>(studentService.createstudent(student), HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get/bystudentId/{id}")
    public ResponseEntity<Student> getById(@PathVariable int id) {
        Student s = studentService.getStudentid(id);
        if (s != null) {
            return new ResponseEntity<>(s, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}