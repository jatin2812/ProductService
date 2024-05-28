package com.productservice.ProductService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {

    private Long id;
    private String title;
    private  int price;

    private String category;

    private String descrpition;

    private String image;
}
