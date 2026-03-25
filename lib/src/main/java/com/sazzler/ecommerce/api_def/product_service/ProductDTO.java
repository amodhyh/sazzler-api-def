 package com.sazzler.ecommerce.product_service;
public record ProductDTO(
        String id,
        String name,
        String description,
        double price,
        int quantity) {

}