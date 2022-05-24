package com.nttdata.pe.product.service.impl;

import com.nttdata.pe.product.model.Product;
import com.nttdata.pe.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getProductsAllService() {
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(Product.builder()
                            .id(1)
                            .name("Producto 01")
                            .build());
        listProduct.add(Product.builder()
                .id(2)
                .name("Producto 02")
                .build());
        listProduct.add(Product.builder()
                .id(3)
                .name("Producto 03")
                .build());
        listProduct.add(Product.builder()
                .id(4)
                .name("Producto 04")
                .build());
        listProduct.add(Product.builder()
                .id(5)
                .name("Producto 05")
                .build());
        return listProduct;
    }

}
