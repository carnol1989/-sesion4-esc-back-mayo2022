package com.nttdata.pe.category.service.impl;

import com.nttdata.pe.category.client.ProductClient;
import com.nttdata.pe.category.model.Category;
import com.nttdata.pe.category.service.CategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategroyService {

    @Autowired
    ProductClient productClient;

    @Override
    public List<Category> getCategoryAllService() {
        List<Category> listCategory = new ArrayList<>();
        listCategory.add(Category.builder()
                            .id(1)
                            .description("Categoria 01")
                            .listProduct(productClient.getProductsAllFeign())
                            .build());
        listCategory.add(Category.builder()
                .id(2)
                .description("Categoria 02")
                .listProduct(productClient.getProductsAllFeign())
                .build());
        listCategory.add(Category.builder()
                .id(3)
                .description("Categoria 03")
                .listProduct(productClient.getProductsAllFeign())
                .build());
        return listCategory;
    }

    @Override
    public Category getCategoryProductFeignService() {
        return Category.builder()
                    .id(1)
                    .description("Categoria 01")
                    .listProduct(productClient.getProductsAllFeign())
                    .build();
    }

}
