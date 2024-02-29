package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.School;
import com.example.demo.service.SchoolService;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/postbyschool")
    public ResponseEntity<School> post(@RequestBody School school) {

        try {
            return new ResponseEntity<>(schoolService.create(school), HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get/byschoolId/{id}")
    public ResponseEntity<School> getById(@PathVariable int school_id) {
        School school= schoolService.getSchoolid(school_id);
        if (school != null) {
            return new ResponseEntity<>(school, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}