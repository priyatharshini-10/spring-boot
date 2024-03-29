package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Product;
import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{

    List<Product> findByProductNameStartingWith(String name);
    List<Product> findByProductNameEndingWith(String name);
    
}
