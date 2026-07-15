package com.sazzler.ecommerce.sazzler_api_def.order_service.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Full internal representation of an order, including all line items,
 * pricing, status, and timestamps. Used internally between services.
 */
public record OrderDTO(
        String orderId,
        String userId,
        List<OrderItemDTO> items,
        BigDecimal totalPrice,
        OrderStatus status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}
