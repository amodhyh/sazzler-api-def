package com.sazzler.ecommerce.sazzler_api_def.order_service.DTO;

import java.util.List;

/**
 * Incoming request body for creating a new order.
 * The client only needs to specify which products and how many —
 * pricing and totals are resolved server-side from the product cache.
 */
public record OrderRequest(
        List<OrderItemRequest> items
) {}
