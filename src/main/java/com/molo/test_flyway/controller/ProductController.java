package com.molo.test_flyway.controller;


import com.molo.test_flyway.entity.Product;
import com.molo.test_flyway.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.save(product);
    }
}