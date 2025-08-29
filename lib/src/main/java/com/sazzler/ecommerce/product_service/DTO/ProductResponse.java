package com.sazzler.ecommerce.product_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductResponse {
    private Long id;
    private String description;
    private Double price;
}
