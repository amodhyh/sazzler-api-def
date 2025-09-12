package com.sazzler.ecommerce.api_def.auth_service.Exceptions;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String message) {
        super(message);
    }
}
