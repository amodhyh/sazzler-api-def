package com.sazzler.ecommerce.sazzler_api_def.auth_service.Exceptions;

public class EmptyRegistrationDetails extends RuntimeException {
    public EmptyRegistrationDetails(String message) {
        super(message);
    }
}
