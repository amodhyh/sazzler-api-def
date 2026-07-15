package com.sazzler.ecommerce.sazzler_api_def.order_service.Exceptions;

public class InsufficientProductDataException extends RuntimeException {
    public InsufficientProductDataException(String message) {
        super(message);
    }
}
