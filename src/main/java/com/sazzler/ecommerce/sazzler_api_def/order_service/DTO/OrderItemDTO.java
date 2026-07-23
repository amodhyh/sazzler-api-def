package com.sazzler.ecommerce.sazzler_api_def.order_service.DTO;

import java.math.BigDecimal;

/**
 * Represents a single line item within an order.
 * Captures a snapshot of the product at the time of order creation
 * (name and price), so the order history remains accurate even if
 * the product is later updated or deleted.
 */
public record OrderItemDTO(
        Integer productId,
        String productName,
        int quantity,
        BigDecimal unitPrice
) {}
