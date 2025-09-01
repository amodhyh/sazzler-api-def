package com.sazzler.ecommerce.product_service.DTO;

public record ProductResponse (
     int id,
     String description,
     Double price) {
}
