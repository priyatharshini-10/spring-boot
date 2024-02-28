package com.example.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private final ProductRepo pr;

    public ProductService(ProductRepo pr) {
        this.pr = pr;
    }
    public Product createProduct(Product p)
    {
        return pr.save(p);
    }
    public Product update(int id, Product p)
    {
        Product p1 = pr.findById(id).orElse(null);
        if(p1 != null)
        {
            p1.setProductId(p.getProductId());
            p1.setProductName(p.getProductName());
            p1.setProductDescription(p.getProductDescription());
            return pr.save(p1);
        }
        return p;
    }
    public boolean delete(int id)
    {
        pr.deleteById(id);
        return true;
    }
}