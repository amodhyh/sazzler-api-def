package com.sazzler.ecommerce.sazzler_api_def.product_service.Exceptions;

public class ProductNotFound extends RuntimeException {
    public ProductNotFound(String message) {
        super(message);
    }
}
