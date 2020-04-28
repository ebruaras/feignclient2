package com.example.demo.client;

import com.example.demo.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "feignclient1",url = "localhost:8080/product/createProduct")
public interface ProductClient {
    @PostMapping("")
    void create(Product product);
}
