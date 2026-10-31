package com.example.ecom_proj.service;

import com.example.ecom_proj.model.Product;
import com.example.ecom_proj.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productrepo;

    public List<Product> getAllProducts(){
        return productrepo.findAll();
    }
    public Product getProductById(int id){
        return productrepo.findById(id).orElse(new Product());
    }
}
