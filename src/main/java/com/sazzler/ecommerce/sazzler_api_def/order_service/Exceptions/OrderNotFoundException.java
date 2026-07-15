package com.sazzler.ecommerce.sazzler_api_def.order_service.Exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String message) {
        super(message);
    }
}
