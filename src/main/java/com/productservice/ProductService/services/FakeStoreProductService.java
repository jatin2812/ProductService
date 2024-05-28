package com.productservice.ProductService.services;

import com.productservice.ProductService.dtos.FakeStoreProductDto;
import com.productservice.ProductService.dtos.GenericProductDto;
import jdk.dynalink.beans.StaticClass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service("abc")
@Getter
@Setter

public  class FakeStoreProductService implements ProductService{


        private RestTemplate restTemplate;

        String requestUri="https://fakestoreapi.com/products/2";

        RestTemplateBuilder restTemplateBuilder;

        @Autowired
        public FakeStoreProductService(RestTemplateBuilder restTemplateBuilder) {
            this.restTemplate = restTemplateBuilder.build();
        }

        private static GenericProductDto  convertToGenericProductDto( FakeStoreProductDto fakeStoreProductDto){
            GenericProductDto genericProductDto = new GenericProductDto();

           // genericProductDto.setId(FakeStoreProductDto.getI);

            return genericProductDto;
         }



        @Override
        public GenericProductDto getProductbyId(Long id) {

                ResponseEntity<FakeStoreProductDto> responseEntity= restTemplate.getForEntity(requestUri,FakeStoreProductDto.class);

                GenericProductDto genericProductDto = new GenericProductDto();

                FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();


                return convertToGenericProductDto(fakeStoreProductDto);
        }
}
