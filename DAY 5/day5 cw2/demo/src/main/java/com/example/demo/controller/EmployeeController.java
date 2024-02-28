package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    private final EmployeeService es;
    public EmployeeController(EmployeeService es) {
        this.es = es;
    }
    @PostMapping("/api/employee")
    public ResponseEntity<Employee> insert()
    {
        Employee e = new Employee();
        e.setEmployeeName("John Doe");
        return new ResponseEntity<>(es.insert(e),HttpStatus.CREATED);
    }
    @PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<Employee> update()
    {
        Employee e = new Employee();
        e.setEmployeeEmail("Raj@example.com");
        return new ResponseEntity<>(e,HttpStatus.OK);
    }
    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<Boolean> delete()
    {
        return new ResponseEntity<>(true,HttpStatus.OK);
    }
}