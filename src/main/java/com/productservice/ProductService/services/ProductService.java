package com.productservice.ProductService.services;

import com.productservice.ProductService.dtos.FakeStoreProductDto;
import com.productservice.ProductService.dtos.GenericProductDto;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    GenericProductDto getProductbyId(Long id);
}
