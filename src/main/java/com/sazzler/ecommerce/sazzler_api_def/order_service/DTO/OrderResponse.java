package com.sazzler.ecommerce.sazzler_api_def.order_service.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Slim response DTO returned to the client after creating or retrieving an order.
 * Omits internal fields like userId and item details to keep the response focused.
 */
public record OrderResponse(
        String orderId,
        OrderStatus status,
        BigDecimal totalPrice,
        LocalDateTime createdAt
) {}
