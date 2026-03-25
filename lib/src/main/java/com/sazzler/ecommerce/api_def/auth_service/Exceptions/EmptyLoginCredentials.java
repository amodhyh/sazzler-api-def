package com.sazzler.ecommerce.api_def.auth_service.Exceptions;

public class EmptyLoginCredentials extends RuntimeException {
    public EmptyLoginCredentials(String message) {
        super(message);
    }
}
