package com.sazzler.ecommerce.sazzler_api_def.order_service.DTO;

/**
 * Represents a single line item in an order creation request.
 * The client specifies the product ID and desired quantity only.
 */
public record OrderItemRequest(
        String productId,
        int quantity
) {}
