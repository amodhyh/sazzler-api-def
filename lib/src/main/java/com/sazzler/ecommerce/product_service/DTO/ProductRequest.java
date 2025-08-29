package com.sazzler.ecommerce.product_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    public String name;
    private Long id;
    private String description;
    private Double price;
}
