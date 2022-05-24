package com.nttdata.pe.category.service.impl;

import com.nttdata.pe.category.client.ProductClient;
import com.nttdata.pe.category.model.Category;
import com.nttdata.pe.category.service.CategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategroyService {

    @Autowired
    ProductClient productClient;

    @Override
    public Category getCategoryProductFeignService() {
        return Category.builder()
                    .id(1)
                    .description("Categoria 01")
                    .listProduct(productClient.getProductsAllFeign())
                    .build();
    }

}
