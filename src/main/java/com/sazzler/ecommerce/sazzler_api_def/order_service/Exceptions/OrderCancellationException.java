package com.sazzler.ecommerce.sazzler_api_def.order_service.Exceptions;

public class OrderCancellationException extends RuntimeException {
    public OrderCancellationException(String message) {
        super(message);
    }
}
