package com.nttdata.pe.category.controller;

import com.nttdata.pe.category.model.Category;
import com.nttdata.pe.category.service.CategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategroyService categroyService;

    @GetMapping("/categories")
    public List<Category> getCategoryAllController() { return categroyService.getCategoryAllService(); }

    @GetMapping("/category/product")
    public Category getCategoryProductFeignController() {
        return categroyService.getCategoryProductFeignService();
    }

}
