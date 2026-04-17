package com.sazzler.ecommerce.sazzler_api_def.auth_service.Exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
