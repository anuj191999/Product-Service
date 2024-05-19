package com.product.controller;


import com.product.dto.ProductRequest;
import com.product.dto.ProductResponse;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private  ProductService productService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public  void createProduct(@RequestBody ProductRequest productRequest)
    {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts()
    {
        System.out.println("Method get All Products from Controller has called..");
        return productService.getAllProducts();
    }

}
