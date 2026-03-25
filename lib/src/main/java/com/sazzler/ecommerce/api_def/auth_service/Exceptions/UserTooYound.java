package com.sazzler.ecommerce.api_def.auth_service.Exceptions;

public class UserTooYound extends RuntimeException {
    public UserTooYound(String message) {
        super(message);
    }
}
