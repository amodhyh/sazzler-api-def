package com.sazzler.ecommerce.sazzler_api_def.order_service.Exceptions;

public class OrderNotOwnedException extends RuntimeException {
    public OrderNotOwnedException(String message) {
        super(message);
    }
}
