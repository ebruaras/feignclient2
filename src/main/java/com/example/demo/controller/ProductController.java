package com.example.demo.controller;

import com.example.demo.client.ProductClient;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feignclient1")
public class ProductController {
    @Autowired
    private ProductClient productClient;
    @PostMapping("/createProduct")
    public ResponseEntity<Product> create(Product product){
        product.setId(7);
        product.setProductName("Wallet");
        product.setAmount(60);
        productClient.create(product);
        return ResponseEntity.ok(product);
    }

}
