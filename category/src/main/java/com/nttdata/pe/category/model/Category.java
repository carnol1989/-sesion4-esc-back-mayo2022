package com.nttdata.pe.category.model;

import com.nttdata.pe.category.client.model.Product;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Category {

    private Integer id;

    private String description;

    private List<Product> listProduct;

}
