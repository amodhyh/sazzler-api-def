package com.sazzler.ecommerce.api_def.product_service.DTO;


import java.util.Objects;

public record ProductEvent (
        String productId,
        String status,
         Double price) {

    // This is the compact constructor
    public ProductEvent {
        // Basic Null Check (Using standard java.util.Objects)
        Objects.requireNonNull(productId, "productId must not be null");
        Objects.requireNonNull(status, "status must not be null");
        Objects.requireNonNull(price, "price must not be null");


        if (productId.isBlank()) {
            throw new IllegalArgumentException("productId cannot be empty or blank");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }
}

