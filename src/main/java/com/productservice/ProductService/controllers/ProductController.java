package com.productservice.ProductService.controllers;

import com.productservice.ProductService.dtos.FakeStoreProductDto;
import com.productservice.ProductService.dtos.GenericProductDto;
import com.productservice.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")

public class ProductController {

    @Autowired
    private ProductService productService;



    @GetMapping("/{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id){
        return productService.getProductbyId(id);
    }


}
