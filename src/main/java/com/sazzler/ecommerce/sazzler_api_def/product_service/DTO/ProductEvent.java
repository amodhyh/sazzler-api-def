package com.sazzler.ecommerce.sazzler_api_def.product_service.DTO;

import java.math.BigDecimal;
import java.util.Objects;

public record ProductEvent(
        String productId,
        String name,
        BigDecimal price,
        ProductEventType eventType
) {

    // Compact constructor for validation
    public ProductEvent {
        Objects.requireNonNull(productId, "productId must not be null");
        Objects.requireNonNull(eventType, "eventType must not be null");
        Objects.requireNonNull(price, "price must not be null");

        if (productId.isBlank() || productId.isEmpty()) {
            throw new IllegalArgumentException("productId cannot be empty or blank");
        }

        if (price.intValue() < 0) {
            throw new IllegalArgumentException("price cannot be negative");
        }
    }
}
