package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private final ProductService ps;

    public ProductController(ProductService ps) {
        this.ps = ps;
    }
    @PostMapping("/api/product")
    public ResponseEntity<Product> createProduct(@RequestBody Product p)
    {
        return new ResponseEntity<>(ps.createProduct(p),HttpStatus.CREATED);
    }
    @PutMapping("/api/product/{id}")
    public ResponseEntity<Product> update(@PathVariable int id,@RequestBody Product p)
    {
        return new ResponseEntity<>(ps.update(id,p),HttpStatus.OK);
    }
    @DeleteMapping("/api/product/{productId}")
    public ResponseEntity<Boolean> delete(@PathVariable int productId)
    {
        return new ResponseEntity<>(ps.delete(productId),HttpStatus.OK);
    }
    
}