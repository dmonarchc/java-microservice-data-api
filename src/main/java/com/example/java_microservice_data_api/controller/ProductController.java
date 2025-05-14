package com.example.java_microservice_data_api.controller;

import java.util.Arrays;
import java.util.List;

import com.example.java_microservice_data_api.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    @GetMapping
    public List<Product> getProduct() {
        return Arrays.asList(
            new Product(1L, "Laptop", 999.99),
            new Product(2L, "Keyboard", 49.99),
            new Product(3L, "Mouse", 29.99)
        );
    }
}
