package com.nttdata.pe.category.client;

import com.nttdata.pe.category.client.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "service-product", url = "http://localhost:8081")//Sin eureka server
public interface ProductClient {

    @GetMapping("/products")//uri del microservicio de producto
    List<Product> getProductsAllFeign();

}
