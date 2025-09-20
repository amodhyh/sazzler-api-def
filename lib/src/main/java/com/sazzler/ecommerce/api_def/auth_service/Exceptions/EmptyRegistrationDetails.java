package com.sazzler.ecommerce.api_def.auth_service.Exceptions;

public class EmptyRegistrationDetails extends RuntimeException {
    public EmptyRegistrationDetails(String message) {
        super(message);
    }
}
