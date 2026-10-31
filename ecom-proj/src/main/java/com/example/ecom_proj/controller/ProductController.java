package com.example.ecom_proj.controller;

import com.example.ecom_proj.model.Product;
import com.example.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProductById(id);
    }
}
