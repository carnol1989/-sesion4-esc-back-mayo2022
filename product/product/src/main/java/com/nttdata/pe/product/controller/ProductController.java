package com.nttdata.pe.product.controller;

import com.nttdata.pe.product.model.Product;
import com.nttdata.pe.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProductsAllController() {
        return productService.getProductsAllService();
    }

}
