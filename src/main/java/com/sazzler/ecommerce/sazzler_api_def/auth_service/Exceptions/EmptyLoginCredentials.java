package com.sazzler.ecommerce.sazzler_api_def.auth_service.Exceptions;

public class EmptyLoginCredentials extends RuntimeException {
    public EmptyLoginCredentials(String message) {
        super(message);
    }
}
