package com.sazzler.ecommerce.sazzler_api_def.product_service.DTO;

import java.util.Objects;

public record ProductEvent(
        Integer productId,
        String name,
        Double price,
        ProductEventType eventType
) {

    // Compact constructor for validation
    public ProductEvent {
        Objects.requireNonNull(productId, "productId must not be null");
        Objects.requireNonNull(eventType, "eventType must not be null");
        Objects.requireNonNull(price, "price must not be null");

        if (productId.intValue() == 0) {
            throw new IllegalArgumentException("productId cannot be empty or blank");
        }

        if (price < 0) {
            throw new IllegalArgumentException("price cannot be negative");
        }
    }
}
